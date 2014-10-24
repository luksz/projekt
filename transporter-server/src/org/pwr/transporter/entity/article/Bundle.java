
package org.pwr.transporter.entity.article;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;



/**
 * <pre>
 *    Model for delivery package.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.3
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "bundle")
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_WARE_ID)
public class Bundle extends GenericWare {

    /**  */
    private static final long serialVersionUID = 5046209778645679426L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @Column(name = "consecutiveNumber")
    private String consecutiveNumber;
}
