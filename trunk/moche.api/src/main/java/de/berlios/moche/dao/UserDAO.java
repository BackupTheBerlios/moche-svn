package de.berlios.moche.dao;

import de.berlios.moche.model.User;
import java.util.List;

/**
 *
 * @author jjhop
 */
public interface UserDAO {
    public User getById(Long id) throws Exception;
    public List<User> getAll() throws Exception;
    public void remove(Long id) throws Exception;
    public void save(User user) throws Exception;
}
