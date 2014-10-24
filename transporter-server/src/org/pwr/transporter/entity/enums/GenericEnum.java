
package org.pwr.transporter.entity.enums;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *    Base for all other enums.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class GenericEnum extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -2272167303588056019L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @Column(name = "name")
    private String name;

    @Column(name = "value")
    private int value;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getValue() {
        return this.value;
    }


    public void setValue(int value) {
        this.value = value;
    }
}
