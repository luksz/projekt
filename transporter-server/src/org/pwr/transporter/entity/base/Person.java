package org.pwr.transporter.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *     Base for other classes using person.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "person")
@PrimaryKeyJoinColumn(name = "id")
public class Person extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 5874687155183652078L;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;


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
