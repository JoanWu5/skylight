package com.skyLight.skyLight.entity;

public class UserBlogComment extends UserBlogCommentKey {
    private String useId;

    public String getUseId() {
        return useId;
    }

    public void setUseId(String useId) {
        this.useId = useId == null ? null : useId.trim();
    }
}