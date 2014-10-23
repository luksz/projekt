
package org.pwr.transporter.entity.article;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;



/**
 * <pre>
 *    Define article for sales.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "article")
public class Article extends Ware {

    /**  */
    private static final long serialVersionUID = 5680839600729637175L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

}
