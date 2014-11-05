package org.pwr.transporter.server.dao.impl;


import org.pwr.transporter.entity.Users;
import org.pwr.transporter.server.dao.UsersDAO;



/**
 * <pre>
 *  Implementation for users netity
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class UsersDAOImpl extends GenericDAOImpl<Users> implements UsersDAO {

    public UsersDAOImpl() {
        setEntityClass(Users.class);
    }

}
