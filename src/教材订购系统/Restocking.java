/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 教材订购系统;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Peter
 */
@Entity
@Table(name = "restocking")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restocking.findAll", query = "SELECT r FROM Restocking r"),
    @NamedQuery(name = "Restocking.findByBookId", query = "SELECT r FROM Restocking r WHERE r.bookId = :bookId"),
    @NamedQuery(name = "Restocking.findByBookNumber", query = "SELECT r FROM Restocking r WHERE r.bookNumber = :bookNumber"),
    @NamedQuery(name = "Restocking.findByMName", query = "SELECT r FROM Restocking r WHERE r.mName = :mName"),
    @NamedQuery(name = "Restocking.findByCDate", query = "SELECT r FROM Restocking r WHERE r.cDate = :cDate"),
    @NamedQuery(name = "Restocking.findByCNumber", query = "SELECT r FROM Restocking r WHERE r.cNumber = :cNumber"),
    @NamedQuery(name = "Restocking.findByCPrice", query = "SELECT r FROM Restocking r WHERE r.cPrice = :cPrice")})
public class Restocking implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "book_id")
    private String bookId;
    @Basic(optional = false)
    @Column(name = "book_number")
    private int bookNumber;
    @Basic(optional = false)
    @Column(name = "m_name")
    private String mName;
    @Basic(optional = false)
    @Column(name = "c_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cDate;
    @Basic(optional = false)
    @Column(name = "c_number")
    private int cNumber;
    @Basic(optional = false)
    @Column(name = "c_price")
    private float cPrice;
    @JoinColumn(name = "m_id", referencedColumnName = "m_id")
    @ManyToOne(optional = false)
    private Administrator mId;
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Booklist booklist;

    public Restocking() {
    }

    public Restocking(String bookId) {
        this.bookId = bookId;
    }

    public Restocking(String bookId, int bookNumber, String mName, Date cDate, int cNumber, float cPrice) {
        this.bookId = bookId;
        this.bookNumber = bookNumber;
        this.mName = mName;
        this.cDate = cDate;
        this.cNumber = cNumber;
        this.cPrice = cPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public Date getCDate() {
        return cDate;
    }

    public void setCDate(Date cDate) {
        this.cDate = cDate;
    }

    public int getCNumber() {
        return cNumber;
    }

    public void setCNumber(int cNumber) {
        this.cNumber = cNumber;
    }

    public float getCPrice() {
        return cPrice;
    }

    public void setCPrice(float cPrice) {
        this.cPrice = cPrice;
    }

    public Administrator getMId() {
        return mId;
    }

    public void setMId(Administrator mId) {
        this.mId = mId;
    }

    public Booklist getBooklist() {
        return booklist;
    }

    public void setBooklist(Booklist booklist) {
        this.booklist = booklist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Restocking)) {
            return false;
        }
        Restocking other = (Restocking) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Restocking[ bookId=" + bookId + " ]";
    }
    
}
