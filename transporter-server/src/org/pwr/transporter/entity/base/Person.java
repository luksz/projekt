
package org.pwr.transporter.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *     Base for other classes using person e.g. Customer.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 5874687155183652078L;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "baseAdderss")
    private Address baseAddress;

    @Column(name = "contactAdderss")
    private Address contacAddress;


    public Person() {
        name = null;
        surname = null;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getSurname() {
        return this.surname;
    }

}
