
package org.pwr.transporter.entity.logistic;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.entity.sales.GoodsIssuedNote;



/**
 * <pre>
 *    Define traces for tasks.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Itinerary extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -6149459994942910844L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @OneToOne
    private Task task;

    @OneToOne(optional = false)
    private GoodsIssuedNote goodsIssuedNote;
}
