package de.berlios.moche.web.user;

import de.berlios.moche.dao.UserDAO;
import de.berlios.moche.model.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.servlet.view.RedirectView;

/** 
 *
 * @author jjhop
 */
public class UserEditController extends SimpleFormController {

    private final static Log log = LogFactory.getLog(UserEditController.class);

    private UserDAO userDAO;

    @Override
    protected Object formBackingObject(HttpServletRequest request) throws Exception {
        log.debug("formBackingObject");
        User user = null;
        try {
            user = userDAO.getById(Long.parseLong(request.getParameter("userId")));
        } catch (Exception ex) {
            log.warn(ex);
            user = new User();
        }
        return user;
    }

    @Override
    protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response,
        Object command, BindException errors) throws Exception {
        log.debug("onSubmit()");
        ModelAndView mav = null;
        try {
            userDAO.save((User) command);
            mav = new ModelAndView(new RedirectView("/users/list.html", true));
        } catch (Exception ex) {
            log.error(ex);
            mav = new ModelAndView(getFormView());
        }
        return mav;
    }
}