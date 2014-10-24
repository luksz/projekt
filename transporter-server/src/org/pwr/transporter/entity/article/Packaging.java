
package org.pwr.transporter.entity.article;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;
import org.pwr.transporter.entity.enums.article.OpaqueType;



/**
 * <pre>
 *    Model for ware that are opaque.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.3
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "packaging")
@PrimaryKeyJoinColumn(name = NamesForHibernate.GENERIC_WARE_ID)
public class Packaging extends GenericWare {

    /**  */
    private static final long serialVersionUID = -5785461138915317034L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @ManyToOne
    private OpaqueType opaqueType;


    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    public OpaqueType getOpaqueType() {
        return this.opaqueType;
    }


    public void setOpaqueType(OpaqueType opaqueType) {
        this.opaqueType = opaqueType;
    }

}
