package org.pwr.transporter.server.web.validators.forms;


import org.pwr.transporter.server.web.form.CustomerAccountForm;
import org.pwr.transporter.server.web.validators.AddressValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;



/**
 * <pre>
 *    Validator for {@link CustomerAccountForm}.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class CustomerAccountValidator implements Validator {

    @Autowired
    private AddressValidator addressValidator;


    @Override
    public boolean supports(Class<?> clazz) {
        return CustomerAccountForm.class.equals(clazz);
    }


    @Override
    public void validate(Object obj, Errors errors) {
        CustomerAccountForm accountForm = (CustomerAccountForm) obj;
        if( accountForm.getPassword().equals(accountForm.getPassword2()) ) {
            errors.rejectValue("password", "negativeValue", new Object[] { "'id'" }, "id can't be negative");
        }
    }

}
