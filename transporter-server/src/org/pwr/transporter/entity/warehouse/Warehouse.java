
package org.pwr.transporter.entity.warehouse;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *    Define warehouse model.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "warehouse")
public class Warehouse extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 3461170154496460630L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************
}
