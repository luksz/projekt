
package org.pwr.transporter.server.business;


import java.util.List;
import java.util.Map;

import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.server.dao.GenericDAO;



public abstract class GenericLogic<T extends GenericEntity> {

    GenericDAO<T, Long> genericDAO;


    public void setGenericDAO(GenericDAO<T, Long> genericDAO) {
        this.genericDAO = genericDAO;
    }


    public T getByID(Long id) {
        return this.genericDAO.getByID(id);
    }


    public List<T> getList() {
        return this.genericDAO.getList();
    }


    public List<T> search(Map<String, Object> parameterMap) {
        return this.genericDAO.search(parameterMap);
    }


    public Long insert(T entity) {
        return this.genericDAO.insert(entity);
    }


    public void update(T entity) {
        this.genericDAO.update(entity);
    }


    public void delete(T entity) {
        this.genericDAO.delete(entity);
    }


    public void deleteById(Long id) {
        this.genericDAO.deleteById(id);
    }


    public T getById(Long id) {
        return null;
    }
}
