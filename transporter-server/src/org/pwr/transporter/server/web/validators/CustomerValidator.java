
package org.pwr.transporter.server.web.validators;


import org.pwr.transporter.entity.base.Customer;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;



/**
 * <pre>
 *    Validate customer form
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class CustomerValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Customer.class);
    }


    @Override
    public void validate(Object arg0, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "valid.customer.name.not.empty");
    }

}
