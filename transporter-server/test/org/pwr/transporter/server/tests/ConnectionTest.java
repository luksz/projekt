
package org.pwr.transporter.server.tests;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;
import org.pwr.transporter.entity.base.Customer;
import org.pwr.transporter.server.core.hb.HibernateUtil;



/**
 * <pre>
 *    Test DB connection.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class ConnectionTest {

    public Session createConnection() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        return session;
    }


    @Test
    public void sampleSelect() {
        Session session = createConnection();
        Query query = session.createQuery("from " + Customer.TABLE_NAME);
        List list = query.list();
        for( Object o : list ) {
            Customer c = (Customer) o;
            System.out.println(c.getId() + " - " + c.getSearchKey());
        }
    }
}
