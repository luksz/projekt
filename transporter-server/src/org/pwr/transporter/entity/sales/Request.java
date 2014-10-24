
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
 *    Sales request document from client.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.REQUEST_DOCUMENT)
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ID)
public class Request extends GenericDocument {

    /**  */
    private static final long serialVersionUID = -5323409176872050200L;

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

}
