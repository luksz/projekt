
package org.pwr.transporter.server.dao.impl;


import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.server.dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;



/**
 * <pre>
 *    Implementation of base database generic actions.
 * </pre>
 * <hr/>
 * 
 * @author x0r, copied from examples
 * @version 0.0.4
 */
public abstract class GenericDAOImpl<T extends GenericEntity> implements GenericDAO<T> {

    protected Class<T> clazz;

    @Autowired
    protected HibernateTransactionManager transactionManager;


    public void setTransactionManager(HibernateTransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }


    public GenericDAOImpl() {
        System.out.println("Creating generic dao impl");
    }


    public void setEntityClass(final Class<T> clazz) {
        // TODO Setting entity class
        this.clazz = clazz;
    }


    @SuppressWarnings("unchecked")
    public T getByID(Long id) {
        // TODO Select by ID
        return (T) getCurrentSession().get(clazz, id);
    }


    @SuppressWarnings("unchecked")
    public List<T> getList() {
        // TODO Select as list
        Session session = getCurrentSession();
        Transaction tx = session.beginTransaction();
        String cname = clazz.getName();
        Query query = session.createQuery("from " + cname);
        List<T> resultList = query.list();
        tx.commit();
        return resultList;
    }


    @SuppressWarnings("unchecked")
    public List<T> search(Map<String, Object> parameterMap) {
        // TODO For search purpose
        Criteria criteria = getCurrentSession().createCriteria(clazz);
        Set<String> fieldName = parameterMap.keySet();
        for( String field : fieldName ) {
            criteria.add(Restrictions.ilike(field, parameterMap.get(field)));
        }
        return criteria.list();
    }


    public Long insert(T entity) {
        // TODO Save to database
        return (Long) getCurrentSession().save(entity);
    }


    public void update(T entity) {
        // TODO Update entity on database
        getCurrentSession().update(entity);
    }


    public void delete(T entity) {
        // TODO Delete by entity
        getCurrentSession().delete(entity);
    }


    public void deleteById(Long id) {
        // TODO Delete by id of entity
        delete(getByID(id));
    }


    protected DetachedCriteria createDetachedCriteria() {
        return DetachedCriteria.forClass(clazz);
    }


    private Session getCurrentSession() {
        Session session = transactionManager.getSessionFactory().getCurrentSession();
        return session;
    }

}
