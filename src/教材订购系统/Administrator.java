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
@Table(name = "administrator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Administrator.findAll", query = "SELECT a FROM Administrator a"),
    @NamedQuery(name = "Administrator.findByMId", query = "SELECT a FROM Administrator a WHERE a.mId = :mId"),
    @NamedQuery(name = "Administrator.findByMPassword", query = "SELECT a FROM Administrator a WHERE a.mPassword = :mPassword"),
    @NamedQuery(name = "Administrator.findByMName", query = "SELECT a FROM Administrator a WHERE a.mName = :mName"),
    @NamedQuery(name = "Administrator.findByMSex", query = "SELECT a FROM Administrator a WHERE a.mSex = :mSex"),
    @NamedQuery(name = "Administrator.findByMTele", query = "SELECT a FROM Administrator a WHERE a.mTele = :mTele")})
public class Administrator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "m_id")
    private String mId;
    @Basic(optional = false)
    @Column(name = "m_password")
    private String mPassword;
    @Basic(optional = false)
    @Column(name = "m_name")
    private String mName;
    @Basic(optional = false)
    @Column(name = "m_sex")
    private Character mSex;
    @Basic(optional = false)
    @Column(name = "m_tele")
    private String mTele;

    public Administrator() {
    }

    public Administrator(String mId) {
        this.mId = mId;
    }

    public Administrator(String mId, String mPassword, String mName, Character mSex, String mTele) {
        this.mId = mId;
        this.mPassword = mPassword;
        this.mName = mName;
        this.mSex = mSex;
        this.mTele = mTele;
    }

    public String getMId() {
        return mId;
    }

    public void setMId(String mId) {
        this.mId = mId;
    }

    public String getMPassword() {
        return mPassword;
    }

    public void setMPassword(String mPassword) {
        this.mPassword = mPassword;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public Character getMSex() {
        return mSex;
    }

    public void setMSex(Character mSex) {
        this.mSex = mSex;
    }

    public String getMTele() {
        return mTele;
    }

    public void setMTele(String mTele) {
        this.mTele = mTele;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mId != null ? mId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administrator)) {
            return false;
        }
        Administrator other = (Administrator) object;
        if ((this.mId == null && other.mId != null) || (this.mId != null && !this.mId.equals(other.mId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u6559\u6750\u8ba2\u8d2d\u7cfb\u7edf.\u8ba2\u8d2d\u7ba1\u7406.Administrator[ mId=" + mId + " ]";
    }
    
}
