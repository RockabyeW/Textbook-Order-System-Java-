package 教材订购系统;

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
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "student")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s"),
    @NamedQuery(name = "Student.findByStudentId", query = "SELECT s FROM Student s WHERE s.studentId = :studentId"),
    @NamedQuery(name = "Student.findByStudentPassword", query = "SELECT s FROM Student s WHERE s.studentPassword = :studentPassword"),
    @NamedQuery(name = "Student.findByStudentName", query = "SELECT s FROM Student s WHERE s.studentName = :studentName"),
    @NamedQuery(name = "Student.findByStudentSex", query = "SELECT s FROM Student s WHERE s.studentSex = :studentSex"),
    @NamedQuery(name = "Student.findByStudentDepartment", query = "SELECT s FROM Student s WHERE s.studentDepartment = :studentDepartment"),
    @NamedQuery(name = "Student.findByStudentMajor", query = "SELECT s FROM Student s WHERE s.studentMajor = :studentMajor"),
    @NamedQuery(name = "Student.findByStudentTele", query = "SELECT s FROM Student s WHERE s.studentTele = :studentTele")})
public class Student implements Serializable {

    @Basic(optional = false)
    @Column(name = "student_sex")
    private String studentSex;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "student")
    private Orderlist orderlist;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_id")
    private String studentId;
    @Basic(optional = false)
    @Column(name = "student_password")
    private String studentPassword;
    @Basic(optional = false)
    @Column(name = "student_name")
    private String studentName;
    @Basic(optional = false)
    @Column(name = "student_department")
    private String studentDepartment;
    @Basic(optional = false)
    @Column(name = "student_major")
    private String studentMajor;
    @Basic(optional = false)
    @Column(name = "student_tele")
    private String studentTele;

    public Student() {
    }

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String studentPassword, String studentName, String studentSex, String studentDepartment, String studentMajor, String studentTele) {
        this.studentId = studentId;
        this.studentPassword = studentPassword;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentDepartment = studentDepartment;
        this.studentMajor = studentMajor;
        this.studentTele = studentTele;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentTele() {
        return studentTele;
    }

    public void setStudentTele(String studentTele) {
        this.studentTele = studentTele;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Student[ studentId=" + studentId + " ]";
    }

    public Orderlist getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Orderlist orderlist) {
        this.orderlist = orderlist;
    }
}
