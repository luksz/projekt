
package org.pwr.transporter.entity.sales;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;
import org.pwr.transporter.entity.base.GenericDocument;



/**
 * <pre>
 *    Financial outgoing document.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.SALES_INVOICE_DOCUMENT)
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ID)
public class SalesInvoice extends GenericDocument {

    /**  */
    private static final long serialVersionUID = 7787438532998648360L;

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
