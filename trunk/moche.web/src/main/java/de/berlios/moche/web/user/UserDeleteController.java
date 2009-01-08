package de.berlios.moche.web.user;

import de.berlios.moche.dao.UserDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author jjhop
 */
public class UserDeleteController implements Controller {

    private static final Log log = LogFactory.getLog(UserDeleteController.class);

    private UserDAO userDAO;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        // na razie zakladamy ze nic sie zlego stac nie moze
        userDAO.remove(Long.parseLong(request.getParameter("userId")));
        return new ModelAndView(new RedirectView("/users/list.html", true));
    }

    public void setUserDAO(UserDAO userDAO) { this.userDAO = userDAO; }
}
