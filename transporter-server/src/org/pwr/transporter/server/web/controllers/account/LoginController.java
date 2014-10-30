package org.pwr.transporter.server.web.controllers.account;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * <pre>
 *    Show login or logout page.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.3
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/log/login", method = RequestMethod.GET)
    public String doGetLogin(HttpServletRequest request, HttpServletResponse response) {
        return "/Views/log/login";
    }


    @RequestMapping(value = "/log/login", method = RequestMethod.POST)
    public String doPostLogin(HttpServletRequest request, HttpServletResponse response) {
        return "/index";
    }


    @RequestMapping(value = "/log/logout", method = RequestMethod.GET)
    public String doGetLogout(HttpServletRequest request, HttpServletResponse response) {
        return "/Views/log/logout";
    }
}
