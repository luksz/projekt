
package org.pwr.transporter.entity.article;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *     Interface for all storage objects.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Ware extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -3960765434403545102L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************
    @Column(name = "width")
    private BigDecimal width;

    @Column(name = "height")
    private BigDecimal height;

    @Column(name = "depth")
    private BigDecimal depth;

    @Column(name = "weight")
    private BigDecimal weight;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************
    public BigDecimal getWidth() {
        return this.width;
    }


    public void setWidth(BigDecimal width) {
        this.width = width;
    }


    public BigDecimal getHeight() {
        return this.height;
    }


    public void setHeight(BigDecimal height) {
        this.height = height;
    }


    public BigDecimal getDepth() {
        return this.depth;
    }


    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }


    public BigDecimal getWeight() {
        return this.weight;
    }


    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

}
