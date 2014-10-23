
package org.pwr.transporter.entity.enums.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *     Standard enumeration for define street prefixes.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Table(name = "enum_addr_street_prefix")
public class AddrStreetPrefix extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 4257968750152980117L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************
    @Column(name = "name")
    private String name;

    @Column(name = "nprefix")
    private String prefix;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPrefix() {
        return prefix;
    }


    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

}
