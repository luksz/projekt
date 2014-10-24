
package org.pwr.transporter.entity.base;


import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;



/**
 * <pre>
 *    Base abstract document for all other documents.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.4
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.GENERIC_DOCUMENT)
public abstract class GenericDocument implements Serializable {

    /**  */
    private static final long serialVersionUID = -2711151678883226411L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "search_key", nullable = false)
    private String searchKey;

    @Column(name = "active", nullable = false)
    private boolean active;

    @ManyToOne
    private Customer customer;

    @OneToOne
    private Address deliveryAddress;

    @OneToMany(mappedBy = "genericDocument")
    private Set<GenericDocumentRow> rowList;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public Customer getCustomer() {
        return this.customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Address getDeliveryAddress() {
        return this.deliveryAddress;
    }


    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getSearchKey() {
        return this.searchKey;
    }


    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }


    public boolean isActive() {
        return this.active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }


    public Set<GenericDocumentRow> getRowList() {
        return this.rowList;
    }


    public void setRowList(Set<GenericDocumentRow> rowList) {
        this.rowList = rowList;
    }

}
