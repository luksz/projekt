package org.pwr.transporter.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



/**
 * <pre>
 *    Define users roles.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.2
 */
@Entity
@Table(name = NamesForHibernate.ROLE)
public class Role extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 522326271270007902L;

    @Column
    private String name;


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }
}
