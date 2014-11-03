
package org.pwr.transporter.server.web.controllers.account;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.pwr.transporter.entity.base.Country;
import org.pwr.transporter.entity.enums.base.AddrStreetPrefix;
import org.pwr.transporter.server.web.services.CountryService;
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
 * @author W.S.
 * @version 0.0.1
 */
@Controller
public class AccountController {

    private static Logger LOGGER = Logger.getLogger(AccountController.class);

    @Autowired
    private AddrStreetPrefixService addrStreetPrefixService;

    @Autowired
    private CountryService countrService;


    @RequestMapping(value = "/log/register", method = RequestMethod.GET)
    public ModelAndView doGetRegister(HttpServletRequest request, HttpServletResponse response) {

        List<AddrStreetPrefix> addrStreetPrefixs = addrStreetPrefixService.getList();
        List<Country> countires = countrService.getList();

        LOGGER.debug("Get streets prefixes: " + addrStreetPrefixs.toString());
        LOGGER.debug("Get countries: " + countires.toString());
        for( Country c : countires ) {
            LOGGER.debug(c.getName());
        }

        ModelAndView model = new ModelAndView("/Views/log/register");

        model.addObject("addrStreetPrefixs", addrStreetPrefixs);
        model.addObject("countires", countires);

        return model;
    }


    @RequestMapping(value = "/log/register", method = RequestMethod.POST)
    public String doPostRegister(HttpServletRequest request, HttpServletResponse response) {

        return "/Views/log/register";
    }
}
