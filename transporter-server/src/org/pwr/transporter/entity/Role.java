package org.pwr.transporter.entity;


import javax.persistence.Entity;
import javax.persistence.Table;



/**
 * <pre>
 *    Define users roles.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 */
@Entity
@Table(name = NamesForHibernate.ROLE)
public class Role extends GenericEntity {

    /**  */
    private static final long serialVersionUID = 522326271270007902L;

}
