
package org.pwr.transporter.entity.enums.base;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;



@Entity
@Table(name = "enum_emplyee_type")
public class EmplyeeType extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -3757995009029736405L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************
    private int value;
}
