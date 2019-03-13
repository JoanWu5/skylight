package com.skyLight.skyLight.entity;

public class Session {
    private String id;

    private String name;

    private String blogId;

    private String sessionConcernId;

    private String sessionArticleId;

    private Integer sessionConcernTotal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getSessionConcernId() {
        return sessionConcernId;
    }

    public void setSessionConcernId(String sessionConcernId) {
        this.sessionConcernId = sessionConcernId == null ? null : sessionConcernId.trim();
    }

    public String getSessionArticleId() {
        return sessionArticleId;
    }

    public void setSessionArticleId(String sessionArticleId) {
        this.sessionArticleId = sessionArticleId == null ? null : sessionArticleId.trim();
    }

    public Integer getSessionConcernTotal() {
        return sessionConcernTotal;
    }

    public void setSessionConcernTotal(Integer sessionConcernTotal) {
        this.sessionConcernTotal = sessionConcernTotal;
    }
}