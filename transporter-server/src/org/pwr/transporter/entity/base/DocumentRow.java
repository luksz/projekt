package org.pwr.transporter.entity.base;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *     Abstract definition for document row.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class DocumentRow extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 8415513351044892188L;

}
