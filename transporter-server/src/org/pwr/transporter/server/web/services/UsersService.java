package org.pwr.transporter.server.web.services;


import java.util.List;
import java.util.Map;

import org.pwr.transporter.entity.Users;
import org.pwr.transporter.server.business.UsersLogic;
import org.pwr.transporter.server.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;



/**
 * <pre>
 *    Service for {@link Users} entity.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class UsersService {

    @Autowired
    UsersLogic usersLogic;


    public Users getByID(Long id) {
        return this.usersLogic.getByID(id);
    }


    public List<Users> getList() {
        return this.usersLogic.getList();
    }


    public List<Users> search(Map<String, Object> parameterMap) {
        return this.usersLogic.search(parameterMap);
    }


    public Long insert(Users entity) {
        return this.usersLogic.insert(entity);
    }


    public void update(Users entity) {
        this.usersLogic.update(entity);
    }


    public void delete(Users entity) {
        this.usersLogic.delete(entity);
    }


    public void deleteById(Long id) {
        this.usersLogic.deleteById(id);
    }


    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersLogic.setUsersDAO(usersDAO);
    }

}
