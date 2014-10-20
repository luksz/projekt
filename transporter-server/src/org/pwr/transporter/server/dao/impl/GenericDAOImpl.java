
package org.pwr.transporter.server.dao.impl;


import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.pwr.transporter.entity.GenericEntity;
import org.pwr.transporter.server.dao.GenericDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;



/**
 * <pre>
 *    Implementation of base database actions.
 * </pre>
 * <hr/>
 * 
 * @author x0r, copied from examples
 * @version 0.0.2
 */
@SuppressWarnings("rawtypes")
public abstract class GenericDAOImpl {

    public abstract class HibernateDAOImpl<T extends GenericEntity, ID extends Serializable> extends HibernateDaoSupport implements GenericDAO<T, ID> {

        protected Class clazz;

        @Autowired
        protected SessionFactory sessionFactory;


        public void setEntityClass(final Class clazz) {
            // TODO Setting entity class
            this.clazz = clazz;
        }


        @SuppressWarnings("unchecked")
        public T getByID(ID id) {
            // TODO Select by ID
            return (T) getCurrentSession().get(clazz, id);
        }


        @SuppressWarnings("unchecked")
        public List<T> getList() {
            // TODO Select as list
            return getCurrentSession().createQuery("from " + clazz.getName()).list();
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


        @SuppressWarnings("unchecked")
        public ID insert(T entity) {
            // TODO Save to database
            return (ID) getCurrentSession().save(entity);
        }


        public void update(T entity) {
            // TODO Update entity on database
            getCurrentSession().update(entity);
        }


        public void delete(T entity) {
            // TODO Delete by entity
            getCurrentSession().delete(entity);
        }


        public void deleteById(ID id) {
            // TODO Delete by id of entity
            delete(getByID(id));
        }


        protected DetachedCriteria createDetachedCriteria() {
            return DetachedCriteria.forClass(clazz);
        }


        private Session getCurrentSession() {
            return sessionFactory.getCurrentSession();
        }

    }
}
