package org.pwr.transporter.server.web.controllers.account;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.pwr.transporter.entity.Users;
import org.pwr.transporter.entity.base.Address;
import org.pwr.transporter.entity.base.Country;
import org.pwr.transporter.entity.base.Customer;
import org.pwr.transporter.entity.enums.base.AddrStreetPrefix;
import org.pwr.transporter.server.web.services.CountryService;
import org.pwr.transporter.server.web.services.enums.AddrStreetPrefixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
 * @version 0.0.3
 */
@Controller
public class AccountController {

    private static Logger LOGGER = Logger.getLogger(AccountController.class);

    @Autowired
    private AddrStreetPrefixService addrStreetPrefixService;

    @Autowired
    private CountryService countryService;


    @RequestMapping(value = "/log/register", method = RequestMethod.GET)
    public ModelAndView doGetRegister(HttpServletRequest request, HttpServletResponse response) {

        List<AddrStreetPrefix> addrStreetPrefixs = addrStreetPrefixService.getList();
        List<Country> countires = countryService.getList();

        for( Country c : countires ) {
            LOGGER.debug(c.getName());
        }

        ModelAndView model = new ModelAndView("/Views/log/register");

        model.addObject("addrStreetPrefixs", addrStreetPrefixs);
        model.addObject("countries", countires);
        model.addObject("customer", new Customer());
        model.addObject("user", new Users());
        model.addObject("baseAddress", new Address());
        model.addObject("correspondeAddress", new Address());

        return model;
    }


    @RequestMapping(value = "/log/register", method = RequestMethod.POST)
    public ModelAndView doPostRegister(@ModelAttribute("customer") Customer customer, @ModelAttribute("baseAddress") Address baseAddress,
            @ModelAttribute("correspondeAddress") Address correspondeAddress, @ModelAttribute("user") Users user, BindingResult result) {

        LOGGER.debug("Password: " + user.getPassword());
        LOGGER.debug("Userame: " + user.getUsername());
        LOGGER.debug("email: " + user.getEmail());
        LOGGER.debug("salt: " + user.getSalt());

        ModelAndView model = new ModelAndView("/index");
        return model;
    }
}
