package org.pwr.transporter.server.business;


import java.util.List;
import java.util.Map;

import org.pwr.transporter.entity.Users;
import org.pwr.transporter.server.dao.UsersDAO;



/**
 * <pre>
 *    Business logic for {@link Users} entity.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class UsersLogic {

    UsersDAO usersDAO;


    public Users getByID(Long id) {
        return this.usersDAO.getByID(id);
    }


    public List<Users> getList() {
        return this.usersDAO.getList();
    }


    public List<Users> search(Map<String, Object> parameterMap) {
        return this.usersDAO.search(parameterMap);
    }


    public Long insert(Users entity) {
        return this.usersDAO.insert(entity);
    }


    public void update(Users entity) {
        this.usersDAO.update(entity);
    }


    public void delete(Users entity) {
        this.usersDAO.delete(entity);
    }


    public void deleteById(Long id) {
        this.usersDAO.deleteById(id);
    }


    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

}
