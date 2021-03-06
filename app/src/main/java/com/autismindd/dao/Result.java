package com.autismindd.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "RESULT".
 */
public class Result {

    private Long id;
    private Long key;
    private Boolean active;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
    private long taskId;
    private long itemId;

    public Result() {
    }

    public Result(Long id) {
        this.id = id;
    }

    public Result(Long id, Long key, Boolean active, java.util.Date createdAt, java.util.Date updatedAt, long taskId, long itemId) {
        this.id = id;
        this.key = key;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.taskId = taskId;
        this.itemId = itemId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

}
