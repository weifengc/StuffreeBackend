package com.weifengcui.demo.entity;

import javax.persistence.*;

//Learn more from https://dzone.com/articles/jpa-tutorial-mapping-entities-0
@Entity
@Table(name = "user")
public class User {
    @Id
//  @GeneratedValue(strategy = GenerationType.AUTO) don't set the auto generate value here since the DB already set that.
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_password")
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
