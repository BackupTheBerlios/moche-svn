package de.berlios.moche.web;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author jjhop
 */
public class IndexController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
        throws Exception {
        ModelAndView mav = new ModelAndView("index");
        List i = new ArrayList();
        i.add("testest");
        i.add("testest1");
        i.add("testest2");
        i.add("testest3");
        mav.addObject("news", i);
        return mav;
    }
}