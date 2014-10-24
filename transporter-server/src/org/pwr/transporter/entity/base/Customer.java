
package org.pwr.transporter.entity.base;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * <pre>
 *    Customer data model.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.3
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "customer")
public class Customer extends Person {

    /**  */
    private static final long serialVersionUID = -4846713817748229295L;

    public static final String TABLE_NAME = "customer";

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @OneToMany(mappedBy = TABLE_NAME)
    Set<Address> deliveryAddress;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public Set<Address> getDeliveryAddress() {
        return this.deliveryAddress;
    }


    public void setDeliveryAddress(Set<Address> deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
