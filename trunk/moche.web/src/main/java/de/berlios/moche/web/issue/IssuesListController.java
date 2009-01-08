package de.berlios.moche.web.issue;

import de.berlios.moche.dao.IssueDAO;
import de.berlios.moche.model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author jjhop
 */
public class IssuesListController implements Controller {

    private final static Log log = LogFactory.getLog(IssuesListController.class);
    
    private IssueDAO issueDAO;

    /**
     * jesli request.getParameter('projectId') == null, wyciagamy wszystkie problemy z bazki,
     * dodajac kolumne projekt,  jesli ten parametr jest ustawiony to kolumna projekt nie jest
     * wyswietlana a bledy wybieramy tylko z wybranego projektu... oczywiscie wybierajac projekt,
     * sprawdzamy czy uzytkownik jest z nim powiazany - jesli nie to niech sie buja... wybierajac
     * wszystkie projekty rowniez wybieramy tylko te, z ktorymi uzytkownik jest powiazany...
     *
     * @param request
     * @param response
     * @return
     * @throws java.lang.Exception
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        log.debug("entering IssuesListController->handleRequest()");
        ModelAndView mav = null;
        String projectId = request.getParameter("projectId");
        User user = (User)request.getSession().getAttribute("user");

        if(checkIfCurrentUserHasRightsToProject(user, projectId)) {
            mav = new ModelAndView("issuesList");
            mav.addObject("issuesList", issueDAO.getAll());
        } else {
            mav = new ModelAndView("issueListNoRights");
            // tutaj informacja o braku uprawnien do danych
        }
        log.debug("return from IssuesListController->handleRequest() with " + mav);
        return mav;
    }

    public boolean checkIfCurrentUserHasRightsToProject(User user, String projectId) {
        return true;
    }

    public void setIssueDAO(IssueDAO issueDAO) {
        this.issueDAO = issueDAO;
    }
}
