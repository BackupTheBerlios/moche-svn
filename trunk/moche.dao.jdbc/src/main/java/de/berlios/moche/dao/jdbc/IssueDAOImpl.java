package de.berlios.moche.dao.jdbc;

import de.berlios.moche.dao.IssueDAO;
import de.berlios.moche.model.Issue;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *
 * @author jjhop
 */
@SuppressWarnings({"unchecked"})
public class IssueDAOImpl extends JdbcDaoSupport implements IssueDAO {

    public Issue getById(Long issueId) throws Exception {
        return (Issue) this.getJdbcTemplate().queryForObject(
            "SELECT * FROM issues WHERE issue_id=?",
            new Object[]{},
            new IssueRowMapper()
        );
    }

    public List<Issue> getAll() throws Exception {
        return this.getJdbcTemplate().query(
            "SELECT * FROM issues ORDER BY create_date DESC",
            new IssueRowMapper()
        );
    }
}

class IssueRowMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Issue issue = new Issue();
        issue.setIssueId(rs.getLong("issue_id"));
        issue.setCreateDate(rs.getDate("create_date"));
        issue.setSummary(rs.getString("summary"));
        issue.setShortDescription(rs.getString("short_desc"));
        return issue;
    }
}