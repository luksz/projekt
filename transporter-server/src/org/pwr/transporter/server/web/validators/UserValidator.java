
package org.pwr.transporter.server.web.validators;


import org.pwr.transporter.entity.Users;
import org.pwr.transporter.server.web.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;



/**
 * <pre>
 *     Validate new user
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.2
 */
public class UserValidator implements org.springframework.validation.Validator {

    @Autowired
    UsersService usersService;


    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Users.class);
    }


    @Override
    public void validate(Object obj, Errors errors) {
        Users user = (Users) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "valid.user.username.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "valid.user.email.empty");

        Users testUser = usersService.getByUserName(user.getUsername());
        if( testUser != null ) {
            errors.rejectValue("username", "valid.user.username.occupied");
        }
        Users testUser2 = usersService.getByUserEmail(user.getEmail());
        if( testUser2 != null ) {
            errors.rejectValue("username", "valid.user.username.occupied");
        }
    }

}
