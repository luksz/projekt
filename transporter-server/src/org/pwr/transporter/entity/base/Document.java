package org.pwr.transporter.entity.base;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *    Base abstract document for all other documents.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Document extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -2711151678883226411L;

}
