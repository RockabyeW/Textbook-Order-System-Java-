/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 教材订购系统;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Peter
 */
@Entity
@Table(name = "orderlist")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderlist.findAll", query = "SELECT o FROM Orderlist o"),
    @NamedQuery(name = "Orderlist.findByStudentId", query = "SELECT o FROM Orderlist o WHERE o.studentId = :studentId"),
    @NamedQuery(name = "Orderlist.findByStudentName", query = "SELECT o FROM Orderlist o WHERE o.studentName = :studentName"),
    @NamedQuery(name = "Orderlist.findByBookId", query = "SELECT o FROM Orderlist o WHERE o.bookId = :bookId"),
    @NamedQuery(name = "Orderlist.findByBookName", query = "SELECT o FROM Orderlist o WHERE o.bookName = :bookName")})
public class Orderlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "student_name")
    private String studentName;
    @Id
    @Basic(optional = false)
    @Column(name = "book_id")
    private String bookId;
    @Basic(optional = false)
    @Column(name = "book_name")
    private String bookName;

    public Orderlist() {
    }

    public Orderlist(String bookId) {
        this.bookId = bookId;
    }

    public Orderlist(String bookId, String studentId, String studentName, String bookName) {
        this.bookId = bookId;
        this.studentId = studentId;
        this.studentName = studentName;
        this.bookName = bookName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        if (!(object instanceof Orderlist)) {
            return false;
        }
        Orderlist other = (Orderlist) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Orderlist[ bookId=" + bookId + " ]";
    }
    
}
