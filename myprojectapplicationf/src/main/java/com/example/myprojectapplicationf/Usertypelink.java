package com.example.myprojectapplicationf;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usertypelinks")
public class Usertypelink {
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "usertype", length = 50)
    private String usertype;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

}