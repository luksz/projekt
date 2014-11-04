package org.pwr.transporter.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.entity.enums.base.AddrStreetPrefix;



/**
 * <pre>
 *     Standard table, define address.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.6
 */
@Entity
@Table(name = "address")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Address extends GenericEntity {

    private static final long serialVersionUID = 3223188310530625995L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************
    @OneToOne(optional = false)
    private AddrStreetPrefix enumAddrStreetPrefix;

    @OneToOne(optional = false)
    private Country country;

    @Column(name = "zip_code")
    private String zipCode;

    @Column(name = "street")
    private String street;

    @Column(name = "local")
    private String local;

    @Column(name = "city")
    private String city;

    @Column(name = "post_city")
    private String postCity;

    @ManyToOne(optional = true)
    private Customer customer;


    // *******************************************************************************************************************************
    // ****** GETTERS & SETTERS
    // *******************************************************************************************************************************
    public AddrStreetPrefix getEnumAddrStreetPrefix() {
        return enumAddrStreetPrefix;
    }


    public void setEnumAddrStreetPrefix(AddrStreetPrefix enumAddrStreetPrefix) {
        this.enumAddrStreetPrefix = enumAddrStreetPrefix;
    }


    public Country getCountry() {
        return country;
    }


    public void setCountry(Country country) {
        this.country = country;
    }


    public String getZipCode() {
        return zipCode;
    }


    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    public String getLocal() {
        return local;
    }


    public void setLocal(String local) {
        this.local = local;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getPostCity() {
        return postCity;
    }


    public void setPostCity(String postCity) {
        this.postCity = postCity;
    }


    public String getStreet() {
        return this.street;
    }


    public void setStreet(String street) {
        this.street = street;
    }

}
