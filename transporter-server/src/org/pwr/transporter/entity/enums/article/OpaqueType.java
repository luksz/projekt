
package org.pwr.transporter.entity.enums.article;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *    Defines opaque types.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "enum_opaque_type")
public class OpaqueType extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -4712769244306775825L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
