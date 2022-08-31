package 教材订购系统;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "booklist", catalog = "textbook", schema = "")
@NamedQueries({
    @NamedQuery(name = "Booklist_1.findAll", query = "SELECT b FROM Booklist_1 b"),
    @NamedQuery(name = "Booklist_1.findByBookId", query = "SELECT b FROM Booklist_1 b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "Booklist_1.findByBookName", query = "SELECT b FROM Booklist_1 b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Booklist_1.findByBookPress", query = "SELECT b FROM Booklist_1 b WHERE b.bookPress = :bookPress"),
    @NamedQuery(name = "Booklist_1.findByBookPrice", query = "SELECT b FROM Booklist_1 b WHERE b.bookPrice = :bookPrice")})
public class Booklist implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "booklist")
    private Restocking restocking;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "booklist")
    private Inventory inventory;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "booklist")
    private Lack lack;

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "book_id")
    private String bookId;
    @Basic(optional = false)
    @Column(name = "book_name")
    private String bookName;
    @Basic(optional = false)
    @Column(name = "book_press")
    private String bookPress;
    @Basic(optional = false)
    @Column(name = "book_price")
    private float bookPrice;

    public Booklist() {
    }

    public Booklist(String bookId) {
        this.bookId = bookId;
    }

    public Booklist(String bookId, String bookName, String bookPress, float bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPress = bookPress;
        this.bookPrice = bookPrice;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        String oldBookId = this.bookId;
        this.bookId = bookId;
        changeSupport.firePropertyChange("bookId", oldBookId, bookId);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        String oldBookName = this.bookName;
        this.bookName = bookName;
        changeSupport.firePropertyChange("bookName", oldBookName, bookName);
    }

    public String getBookPress() {
        return bookPress;
    }

    public void setBookPress(String bookPress) {
        String oldBookPress = this.bookPress;
        this.bookPress = bookPress;
        changeSupport.firePropertyChange("bookPress", oldBookPress, bookPress);
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        float oldBookPrice = this.bookPrice;
        this.bookPrice = bookPrice;
        changeSupport.firePropertyChange("bookPrice", oldBookPrice, bookPrice);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Booklist)) {
            return false;
        }
        Booklist other = (Booklist) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Booklist_1[ bookId=" + bookId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public Restocking getRestocking() {
        return restocking;
    }

    public void setRestocking(Restocking restocking) {
        this.restocking = restocking;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Lack getLack() {
        return lack;
    }

    public void setLack(Lack lack) {
        this.lack = lack;
    }
    
}
