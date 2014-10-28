package org.pwr.transporter.entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



/**
 * <pre>
 *    Define user roles.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.3
 */
// @Entity
// @Table(name = NamesForHibernate.USERS_ROLES
// , uniqueConstraints = { @UniqueConstraint(columnNames = { NamesForHibernate.ROLE_ID,
// NamesForHibernate.USERS_ID }) }
// )
public class UserRoles extends GenericEntity {

    /**  */
    private static final long serialVersionUID = -1624679923069024257L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @ManyToOne
    @JoinColumn(name = NamesForHibernate.USERS_ID, nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = NamesForHibernate.ROLE_ID, nullable = false)
    private Role role;


    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    public Users getUser() {
        return this.user;
    }


    public Role getRole() {
        return this.role;
    }


    public void setUser(Users user) {
        this.user = user;
    }


    public void setRole(Role role) {
        this.role = role;
    }
}
