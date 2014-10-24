
package org.pwr.transporter.entity.article;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;



/**
 * <pre>
 *     Interface for all storage objects.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.4
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.GENERIC_WARE)
public abstract class GenericWare implements Serializable {

    /**  */
    private static final long serialVersionUID = -3960765434403545102L;


    public GenericWare() {
        active = true;
    }


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

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "search_key", nullable = false)
    private String searchKey;

    @Column(name = "active", nullable = false)
    private boolean active;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getSearchKey() {
        return searchKey;
    }


    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public boolean isActive() {
        return this.active;
    }


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
