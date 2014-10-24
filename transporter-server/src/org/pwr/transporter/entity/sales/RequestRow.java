
package org.pwr.transporter.entity.sales;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;
import org.pwr.transporter.entity.base.GenericDocumentRow;



/**
 * <pre>
 *    Sales request document row model.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.REQUEST_ROW)
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ROW_ID)
public class RequestRow extends GenericDocumentRow {

    /**  */
    private static final long serialVersionUID = 8707983872775670126L;

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
