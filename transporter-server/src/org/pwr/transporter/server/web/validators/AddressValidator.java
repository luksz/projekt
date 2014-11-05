package org.pwr.transporter.server.web.validators;


import org.pwr.transporter.entity.base.Address;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;



/**
 * <pre>
 *    Validate address.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class AddressValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Address.class);
    }


    @Override
    public void validate(Object obj, Errors errors) {
        Address address = (Address) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "valid.address.city");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "local", "valid.address.local");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "postCity", "valid.address.postCity");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "zipCode", "valid.address.zipCode");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "valid.address.country");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "enumAddrStreetPrefix", "valid.address.enumAddrStreetPrefix");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "street", "valid.address.street");
    }
}
