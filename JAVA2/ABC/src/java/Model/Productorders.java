/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Wei
 */
@Entity
@Table(name = "PRODUCTORDERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productorders.findAll", query = "SELECT p FROM Productorders p")
    , @NamedQuery(name = "Productorders.findById", query = "SELECT p FROM Productorders p WHERE p.id = :id")
    , @NamedQuery(name = "Productorders.findByProductid", query = "SELECT p FROM Productorders p WHERE p.productid = :productid")
    , @NamedQuery(name = "Productorders.findByDescription", query = "SELECT p FROM Productorders p WHERE p.description = :description")
    , @NamedQuery(name = "Productorders.findByImage", query = "SELECT p FROM Productorders p WHERE p.image = :image")
    , @NamedQuery(name = "Productorders.findByUnit", query = "SELECT p FROM Productorders p WHERE p.unit = :unit")
    , @NamedQuery(name = "Productorders.findByRetailprice", query = "SELECT p FROM Productorders p WHERE p.retailprice = :retailprice")
    , @NamedQuery(name = "Productorders.findByFreightcharges", query = "SELECT p FROM Productorders p WHERE p.freightcharges = :freightcharges")
    , @NamedQuery(name = "Productorders.findByPackagingcoats", query = "SELECT p FROM Productorders p WHERE p.packagingcoats = :packagingcoats")})
public class Productorders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 10)
    @Column(name = "PRODUCTID")
    private String productid;
    @Size(max = 300)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 100)
    @Column(name = "IMAGE")
    private String image;
    @Column(name = "UNIT")
    private Integer unit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RETAILPRICE")
    private Double retailprice;
    @Column(name = "FREIGHTCHARGES")
    private Double freightcharges;
    @Column(name = "PACKAGINGCOATS")
    private Double packagingcoats;

    public Productorders() {
    }

    public Productorders(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Double getRetailprice() {
        return retailprice;
    }

    public void setRetailprice(Double retailprice) {
        this.retailprice = retailprice;
    }

    public Double getFreightcharges() {
        return freightcharges;
    }

    public void setFreightcharges(Double freightcharges) {
        this.freightcharges = freightcharges;
    }

    public Double getPackagingcoats() {
        return packagingcoats;
    }

    public void setPackagingcoats(Double packagingcoats) {
        this.packagingcoats = packagingcoats;
    }

    public double getAmount() {
        return (double) unit * (double) retailprice;
    }

    public int getDiscount() {
        if (getAmount() > 100) {
            return 10;
        } else {
            return 0;
        }
    }

    public double getTotalAmount() {
        if (getDiscount() == 10) {
            return (double) getAmount() * 110 / 100;
        } else {
            return getAmount();
        }
    }

    public double getTotalPayment() {
        return getTotalAmount() + unit * freightcharges + unit * packagingcoats;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productorders)) {
            return false;
        }
        Productorders other = (Productorders) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Productorders[ id=" + id + " ]";
    }

}
