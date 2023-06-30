package com.example.myprojectapplicationf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productoffers")
public class Productoffer {
    @Id
    @Column(name = "offerid", nullable = false, length = 50)
    private String offerid;

    @Column(name = "\"hs code\"", length = 10)
    private String hsCode;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "offername", length = 50)
    private String offername;

    @Column(name = "qty", length = 50)
    private String qty;

    @Column(name = "unitprice", length = 20)
    private String unitprice;

    public String getOfferid() {
        return offerid;
    }

    public void setOfferid(String offerid) {
        this.offerid = offerid;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOffername() {
        return offername;
    }

    public void setOffername(String offername) {
        this.offername = offername;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(String unitprice) {
        this.unitprice = unitprice;
    }

}