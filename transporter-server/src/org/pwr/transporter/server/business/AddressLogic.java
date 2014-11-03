
package org.pwr.transporter.server.business;


import java.util.List;
import java.util.Map;

import org.pwr.transporter.entity.base.Address;
import org.pwr.transporter.server.dao.AddressDAO;



/**
 * <pre>
 *    Logic for {@link Address} entity
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class AddressLogic {

    private AddressDAO addressDAO;


    public void setAddressDAO(AddressDAO addressDAO) {
        this.addressDAO = addressDAO;
    }


    public Address getByID(Long id) {
        return this.addressDAO.getByID(id);
    }


    public List<Address> getList() {
        return this.addressDAO.getList();
    }


    public List<Address> search(Map<String, Object> parameterMap) {
        return this.addressDAO.search(parameterMap);
    }


    public Long insert(Address entity) {
        return this.addressDAO.insert(entity);
    }


    public void update(Address entity) {
        this.addressDAO.update(entity);
    }


    public void delete(Address entity) {
        this.addressDAO.delete(entity);
    }


    public void deleteById(Long id) {
        this.addressDAO.deleteById(id);
    }

}
