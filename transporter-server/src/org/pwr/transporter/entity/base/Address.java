package org.pwr.transporter.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.entity.enums.base.EnumAddrStreetPrefix;



/**
 * <pre>
 *     Standard table, define address.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Table(name = "Address")
public class Address extends GenericEntity {

    private static final long serialVersionUID = 3223188310530625995L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************
    @Column(name = "enumAddrStreetPrefix")
    private EnumAddrStreetPrefix enumAddrStreetPrefix;

    @Column(name = "country")
    private Country country;

    @Column(name = "zipCode")
    private String zipCode;

    @Column(name = "local")
    private String local;

    @Column(name = "city")
    private String city;

    @Column(name = "postCity")
    private String postCity;


    // *******************************************************************************************************************************
    // ****** GETTERS & SETTERS
    // *******************************************************************************************************************************
    public EnumAddrStreetPrefix getEnumAddrStreetPrefix() {
        return enumAddrStreetPrefix;
    }


    public void setEnumAddrStreetPrefix(EnumAddrStreetPrefix enumAddrStreetPrefix) {
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

}
