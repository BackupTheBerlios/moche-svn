package de.berlios.moche.dao;

import de.berlios.moche.model.Issue;
import java.util.List;

/**
 *
 * @author jjhop
 */
public interface IssueDAO {
    public Issue getById(Long issueId) throws Exception;
    public List<Issue> getAll() throws Exception;

}
