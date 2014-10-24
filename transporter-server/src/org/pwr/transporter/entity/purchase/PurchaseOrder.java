
package org.pwr.transporter.entity.purchase;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;
import org.pwr.transporter.entity.base.GenericDocument;



/**
 * <pre>
 *    Incoming purchase document model.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.PURCHASE_ORDER_DOCUMENT)
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ID)
public class PurchaseOrder extends GenericDocument {

    /**  */
    private static final long serialVersionUID = -2339396878386751043L;

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
