package de.berlios.moche.dao.jdbc;

import de.berlios.moche.dao.UserDAO;
import de.berlios.moche.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author jjhop
 */
public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {

    public User getById(Long id) throws Exception {
        return (User) getJdbcTemplate().queryForObject(
            "SELECT * FROM users WHERE user_id=?",
            new Object[]{ id }, new UserRowMapper()
        );
    }

    public List<User> getAll() throws Exception {
        return this.getJdbcTemplate().query(
            "SELECT * FROM users ORDER BY user_id ASC",
            new UserRowMapper()
        );
    }

    public void remove(Long id) throws Exception {
        getJdbcTemplate().update(
            "DELETE FROM users WHERE user_id=?", new Object[]{id}
        );
    }

    public void save(final User user) throws Exception {
        if (user.getUserId() == null){
            getJdbcTemplate().execute(new ConnectionCallback() {
                public Object doInConnection(Connection conn) throws SQLException, DataAccessException {
                    conn.setAutoCommit(false);
                    PreparedStatement pstmt = conn.prepareStatement(
                        "INSERT INTO users(email, description) VALUES(?,?)");
                    pstmt.setString(1, user.getEmail());
                    pstmt.setString(2, user.getDescription());
                    pstmt.executeUpdate();
                    return null;
                }
            });
        } else {
            getJdbcTemplate().execute(new ConnectionCallback() {
                public Object doInConnection(Connection conn) throws SQLException, DataAccessException {
                    conn.setAutoCommit(false);
                    PreparedStatement pstmt = conn.prepareStatement(
                        "UPDATE users SET email=?,description=? WHERE user_id=?");
                    pstmt.setString(1, user.getEmail());
                    pstmt.setString(2, user.getDescription());
                    pstmt.setLong(3, user.getUserId());
                    pstmt.executeUpdate();
                    return null;
                }
            });
        }
    }
}

class UserRowMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int row) throws SQLException {
        User user = new User();
        user.setUserId(rs.getLong("user_id"));
        user.setEmail(rs.getString("email"));
        user.setDescription(rs.getString("description"));
        return user;
    }
}