package com.weifengcui.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Message entity for a blog message.
 */
@Entity
@Table(name = "message")
public class BlogMessage {
    @Id
    @Column(name = "message_id")
    private int id;

    @Column(name = "created_by_user_id")
    private int createByUserId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public BlogMessage(){}

    public BlogMessage(int createByUserId, String title, String description, Date createdTimestamp) {
        this.createByUserId = createByUserId;
        this.title = title;
        this.description = description;
        this.createdTimestamp = createdTimestamp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "created_at_ts")
    private  java.util.Date createdTimestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreateByUserId() {
        return createByUserId;
    }

    public void setCreateByUserId(int createByUserId) {
        this.createByUserId = createByUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Date getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }
}
