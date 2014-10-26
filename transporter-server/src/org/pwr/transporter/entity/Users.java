package org.pwr.transporter.entity;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.springframework.security.crypto.codec.Hex;



/**
 * <pre>
 *    Define users table
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.3
 */
@Entity
@Table(name = NamesForHibernate.USERS)
public class Users extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 911729503700444961L;

    private static final int SALT_LENGTH = 16;

    private static final Logger LOGGER = Logger.getLogger(Users.class);

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "username", updatable = false, unique = true, nullable = false)
    private String username;

    @Column(name = "salt", nullable = false)
    private String salt;

    @ManyToMany(targetEntity = Role.class)
    private Set<Role> roles;

    @Column(name = "email", nullable = false)
    private String email;


    public static byte[] nextSalt() throws NoSuchAlgorithmException {
        byte[] salt = new byte[SALT_LENGTH];
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(salt);
        return salt;
    }


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public String getPassword() {
        return this.password;
    }


    public void setPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-512");
            byte[] salt = nextSalt();
            this.salt = Hex.encode(salt).toString();
            byte[] input = new byte[username.getBytes().length + password.getBytes().length + salt.length];
            System.arraycopy(salt, 0, input, 0, salt.length);
            System.arraycopy(username.getBytes(), 0, input, salt.length, username.getBytes().length);
            System.arraycopy(password.getBytes(), 0, input, salt.length + username.getBytes().length, password.getBytes().length);
            byte[] enPass = digest.digest(input);
            this.password = Hex.encode(enPass).toString();
        } catch ( NoSuchAlgorithmException e ) {
            LOGGER.debug("Cannot encrypt password", e);
        }
    }


    public Set<Role> getRoles() {
        return this.roles;
    }


    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }


    public String getEmail() {
        return this.email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSalt() {
        return this.salt;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String username) {
        this.username = username;
    }
}
