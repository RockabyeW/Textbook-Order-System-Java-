package 教材订购系统;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "inventory")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventory.findAll", query = "SELECT i FROM Inventory i"),
    @NamedQuery(name = "Inventory.findByBookId", query = "SELECT i FROM Inventory i WHERE i.bookId = :bookId"),
    @NamedQuery(name = "Inventory.findByBookNumber", query = "SELECT i FROM Inventory i WHERE i.bookNumber = :bookNumber")})
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "book_id")
    private String bookId;
    @Basic(optional = false)
    @Column(name = "book_number")
    private int bookNumber;
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Booklist Booklist;

    public Inventory() {
    }

    public Inventory(String bookId) {
        this.bookId = bookId;
    }

    public Inventory(String bookId, int bookNumber) {
        this.bookId = bookId;
        this.bookNumber = bookNumber;
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

    public Booklist getBooklist() {
        return Booklist;
    }

    public void setBooklist(Booklist Booklist) {
        this.Booklist = Booklist;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Inventory)) {
            return false;
        }
        Inventory other = (Inventory) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Inventory[ bookId=" + bookId + " ]";
    }
    
}
