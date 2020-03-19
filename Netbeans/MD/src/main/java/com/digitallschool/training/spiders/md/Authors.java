/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitallschool.training.spiders.md;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author HP
 */
@Entity
@Table(name="authors")
public class Authors implements Serializable {
    
    @Id
    @Column(name="authors_id")
    long Id;
    @Column(name="name")
    String name;
    @Column(name="email")
    String email;
    @Column(name="profile")
    String profile;
    @Column(name="blog")
    String blog;
    
    public long getId() {
        return Id;
    }
    public void setId(long Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String getBlog() {
        return blog;
    }
    public void setBlog(String blog) {
        this.blog = blog;
    }
    
}
