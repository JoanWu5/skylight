package com.skyLight.skyLight.entity;

import java.util.ArrayList;
import java.util.List;

public class SessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SessionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdIsNull() {
            addCriterion("session_concern_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdIsNotNull() {
            addCriterion("session_concern_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdEqualTo(String value) {
            addCriterion("session_concern_id =", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdNotEqualTo(String value) {
            addCriterion("session_concern_id <>", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdGreaterThan(String value) {
            addCriterion("session_concern_id >", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_concern_id >=", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdLessThan(String value) {
            addCriterion("session_concern_id <", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdLessThanOrEqualTo(String value) {
            addCriterion("session_concern_id <=", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdLike(String value) {
            addCriterion("session_concern_id like", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdNotLike(String value) {
            addCriterion("session_concern_id not like", value, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdIn(List<String> values) {
            addCriterion("session_concern_id in", values, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdNotIn(List<String> values) {
            addCriterion("session_concern_id not in", values, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdBetween(String value1, String value2) {
            addCriterion("session_concern_id between", value1, value2, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernIdNotBetween(String value1, String value2) {
            addCriterion("session_concern_id not between", value1, value2, "sessionConcernId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdIsNull() {
            addCriterion("session_article_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdIsNotNull() {
            addCriterion("session_article_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdEqualTo(String value) {
            addCriterion("session_article_id =", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdNotEqualTo(String value) {
            addCriterion("session_article_id <>", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdGreaterThan(String value) {
            addCriterion("session_article_id >", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_article_id >=", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdLessThan(String value) {
            addCriterion("session_article_id <", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdLessThanOrEqualTo(String value) {
            addCriterion("session_article_id <=", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdLike(String value) {
            addCriterion("session_article_id like", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdNotLike(String value) {
            addCriterion("session_article_id not like", value, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdIn(List<String> values) {
            addCriterion("session_article_id in", values, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdNotIn(List<String> values) {
            addCriterion("session_article_id not in", values, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdBetween(String value1, String value2) {
            addCriterion("session_article_id between", value1, value2, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionArticleIdNotBetween(String value1, String value2) {
            addCriterion("session_article_id not between", value1, value2, "sessionArticleId");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalIsNull() {
            addCriterion("session_concern_total is null");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalIsNotNull() {
            addCriterion("session_concern_total is not null");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalEqualTo(Integer value) {
            addCriterion("session_concern_total =", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalNotEqualTo(Integer value) {
            addCriterion("session_concern_total <>", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalGreaterThan(Integer value) {
            addCriterion("session_concern_total >", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("session_concern_total >=", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalLessThan(Integer value) {
            addCriterion("session_concern_total <", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalLessThanOrEqualTo(Integer value) {
            addCriterion("session_concern_total <=", value, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalIn(List<Integer> values) {
            addCriterion("session_concern_total in", values, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalNotIn(List<Integer> values) {
            addCriterion("session_concern_total not in", values, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalBetween(Integer value1, Integer value2) {
            addCriterion("session_concern_total between", value1, value2, "sessionConcernTotal");
            return (Criteria) this;
        }

        public Criteria andSessionConcernTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("session_concern_total not between", value1, value2, "sessionConcernTotal");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}