
package org.pwr.transporter.server.web.validators.forms;


import org.pwr.transporter.server.web.form.CustomerAccountForm;
import org.pwr.transporter.server.web.validators.AddressValidator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;



/**
 * <pre>
 *    Validator for {@link CustomerAccountForm}.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
public class CustomerAccountValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return CustomerAccountForm.class.equals(clazz);
    }


    @Override
    public void validate(Object obj, Errors errors) {
        CustomerAccountForm accountForm = (CustomerAccountForm) obj;

        ( new AddressValidator("baseAddress.") ).validate(accountForm.getBaseAddress(), errors);

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "valid.account.password.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password2", "valid.account.password.empty");
        if( !accountForm.getPassword().equals(accountForm.getPassword2()) ) {
            errors.rejectValue("password", "valid.account.passwords.not.equals");
            // errors.rejectValue("password2", "negativeValue", new Object[] { "'password2'" }, "");
        }
    }

}
