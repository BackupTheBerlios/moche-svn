package de.berlios.moche.web.user;

import de.berlios.moche.dao.UserDAO;
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
public class UsersListController implements Controller {

    private final static Log log = LogFactory.getLog(UsersListController.class);
    
    private UserDAO userDAO;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {

        ModelAndView mav = new ModelAndView("/users/list");
        mav.addObject("usersList", userDAO.getAll());
        
        return mav;
    }

    public void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO; }

}
