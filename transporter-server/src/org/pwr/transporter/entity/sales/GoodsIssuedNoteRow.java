
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
 *     Model for warehouse outgoing documents rows (WZ)
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.ISSUE_ROW)
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ROW_ID)
public class GoodsIssuedNoteRow extends GenericDocumentRow {

    /**  */
    private static final long serialVersionUID = -5693577206793727272L;

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
