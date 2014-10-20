
package org.pwr.transporter.entity.base;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



/**
 * <pre>
 * Company emplyees model.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "emplyee")
public class Emplyee extends Person {

    /**  */
    private static final long serialVersionUID = 8855580555292412125L;

    @Column(name = "driver", nullable = false)
    private boolean driver;
}
