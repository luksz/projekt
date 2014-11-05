package org.pwr.transporter.server.web.controllers.account;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.pwr.transporter.entity.base.Country;
import org.pwr.transporter.entity.enums.base.AddrStreetPrefix;
import org.pwr.transporter.server.web.form.CustomerAccountForm;
import org.pwr.transporter.server.web.services.AddressService;
import org.pwr.transporter.server.web.services.CountryService;
import org.pwr.transporter.server.web.services.UsersService;
import org.pwr.transporter.server.web.services.enums.AddrStreetPrefixService;
import org.pwr.transporter.server.web.validators.forms.CustomerAccountValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
 * @version 0.0.6
 */
@Controller
public class AccountController {

    private static Logger LOGGER = Logger.getLogger(AccountController.class);

    @Autowired
    private AddrStreetPrefixService addrStreetPrefixService;

    @Autowired
    private CountryService countryService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private AddressService addressService;

    @Autowired
    @Qualifier("customerAccountValidator")
    private CustomerAccountValidator validator;


    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }


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
        model.addObject("customerAccountForm", new CustomerAccountForm());

        return model;
    }


    @RequestMapping(value = "/log/register", method = RequestMethod.POST)
    public ModelAndView doPostRegister(@ModelAttribute("customerAccountForm") @Validated CustomerAccountForm accountForm, BindingResult formBindeings) {

        if( formBindeings.hasErrors() ) {
            LOGGER.info("Validation fails");
            List<AddrStreetPrefix> addrStreetPrefixs = addrStreetPrefixService.getList();
            List<Country> countires = countryService.getList();
            ModelAndView model = new ModelAndView("/log/register");
            model.addObject("addrStreetPrefixs", addrStreetPrefixs);
            model.addObject("countries", countires);
            model.addObject("customerAccountForm", accountForm);
            return model;
        }
        LOGGER.debug("Password: " + accountForm.getUser().getPassword());
        LOGGER.debug("Userame: " + accountForm.getUser().getUsername());
        LOGGER.debug("email: " + accountForm.getUser().getEmail());
        LOGGER.debug("salt: " + accountForm.getUser().getSalt());

        return new ModelAndView("/index");
    }
}
