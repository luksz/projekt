
package org.pwr.transporter.server.dao;


import java.util.List;
import java.util.Map;

import org.pwr.transporter.entity.GenericEntity;



/**
 * <pre>
 *    Base interface for dao.
 * </pre>
 * <hr/>
 * 
 * @author x0r
 * @version 0.0.1
 * @param <T>
 * @param <ID>
 */
public interface GenericDAO<T extends GenericEntity> {

    T getByID(Long id);


    List<T> getList();


    List<T> search(Map<String, Object> parameterMap);


    Long insert(T entity);


    void update(T entity);


    void delete(T entity);


    void deleteById(Long id);

}