
package org.pwr.transporter.entity.base;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.pwr.transporter.entity.NamesForHibernate;
import org.pwr.transporter.entity.article.GenericWare;



/**
 * <pre>
 *     Abstract definition for document row.
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.2
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = NamesForHibernate.GENERIC_DOCUMENT_ROW)
public abstract class GenericDocumentRow implements Serializable {

    /**  */
    private static final long serialVersionUID = 8415513351044892188L;

    // *******************************************************************************************************************************
    // ****** FIELDS
    // *******************************************************************************************************************************

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "search_key", nullable = false)
    private String searchKey;

    @Column(name = "active", nullable = false)
    private boolean active;

    @ManyToOne
    private GenericWare ware;

    @ManyToOne
    @JoinColumn(name = NamesForHibernate.GENERIC_DOCUMENT_ID)
    GenericDocument genericDocument;


    // *******************************************************************************************************************************
    // ****** GETTERS AND SETTERS
    // *******************************************************************************************************************************

    public GenericWare getWare() {
        return this.ware;
    }


    public void setWare(GenericWare ware) {
        this.ware = ware;
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getSearchKey() {
        return this.searchKey;
    }


    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }


    public boolean isActive() {
        return this.active;
    }


    public void setActive(boolean active) {
        this.active = active;
    }

}
