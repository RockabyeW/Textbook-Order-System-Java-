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
@Table(name = "lack")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lack.findAll", query = "SELECT l FROM Lack l"),
    @NamedQuery(name = "Lack.findByBookNumber", query = "SELECT l FROM Lack l WHERE l.bookNumber = :bookNumber"),
    @NamedQuery(name = "Lack.findByBookId", query = "SELECT l FROM Lack l WHERE l.bookId = :bookId")})
public class Lack implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "book_number")
    private int bookNumber;
    @Id
    @Basic(optional = false)
    @Column(name = "book_id")
    private String bookId;
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Booklist booklist;

    public Lack() {
    }

    public Lack(String bookId) {
        this.bookId = bookId;
    }

    public Lack(String bookId, int bookNumber) {
        this.bookId = bookId;
        this.bookNumber = bookNumber;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
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
        if (!(object instanceof Lack)) {
            return false;
        }
        Lack other = (Lack) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Lack[ bookId=" + bookId + " ]";
    }
    
}
