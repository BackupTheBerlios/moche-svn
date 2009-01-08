package de.berlios.moche.web;

import de.berlios.moche.dao.IssueDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author jjhop
 */
public class DashboardController implements Controller {

    private IssueDAO issueDAO;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        ModelAndView mav = new ModelAndView("dashboard");
        mav.addObject("issues", issueDAO.getAll());
        return mav;
    }

    public void setIssueDAO(IssueDAO issueDAO) {
        this.issueDAO = issueDAO;
    }
}