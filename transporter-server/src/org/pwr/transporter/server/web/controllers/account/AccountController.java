package org.pwr.transporter.server.web.controllers.account;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.pwr.transporter.entity.enums.base.AddrStreetPrefix;
import org.pwr.transporter.server.web.services.enums.AddrStreetPrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



/**
 * <pre>
 *    Account show / edit controller.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Controller
public class AccountController {

    private static Logger LOGGER = Logger.getLogger(AccountController.class);

    @Autowired
    AddrStreetPrefixService addrStreetPrefixService;


    @RequestMapping(value = "/log/register", method = RequestMethod.GET)
    public String doGetRegister(ModelAndView model, HttpServletRequest request, HttpServletResponse response) {

        List<AddrStreetPrefix> addrStreetPrefixs = addrStreetPrefixService.getList();

        LOGGER.debug("Get streets prefixes: " + addrStreetPrefixs.toString());

        model.addObject("addrStreetPrefixs", addrStreetPrefixs);

        return "/Views/log/register";
    }


    @RequestMapping(value = "/log/register", method = RequestMethod.POST)
    public String doPostRegister(HttpServletRequest request, HttpServletResponse response) {

        return "/Views/log/register";
    }
}
