
package org.pwr.transporter.entity.warehouse;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Any;
import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.entity.article.GenericWare;



/**
 * <pre>
 *     Define state on shelf for some article.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "inventory_balance")
public class InventoryBalance extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -7265386600691885679L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @ManyToOne(optional = false)
    private Shelf shelf;

    // FIXME check what it is doing
    @Any(metaColumn = @Column(name = "id"))
    @ManyToOne(optional = false)
    private GenericWare ware;

    @Column(name = "quantity", nullable = false)
    private BigDecimal quantity;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public Shelf getShelf() {
        return this.shelf;
    }


    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }


    public GenericWare getWare() {
        return this.ware;
    }


    public void setWare(GenericWare ware) {
        this.ware = ware;
    }


    public BigDecimal getQuantity() {
        return this.quantity;
    }


    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

}
