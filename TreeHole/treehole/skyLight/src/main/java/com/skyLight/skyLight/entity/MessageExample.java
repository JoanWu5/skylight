package com.skyLight.skyLight.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNull() {
            addCriterion("user1_id is null");
            return (Criteria) this;
        }

        public Criteria andUser1IdIsNotNull() {
            addCriterion("user1_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser1IdEqualTo(String value) {
            addCriterion("user1_id =", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotEqualTo(String value) {
            addCriterion("user1_id <>", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThan(String value) {
            addCriterion("user1_id >", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdGreaterThanOrEqualTo(String value) {
            addCriterion("user1_id >=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThan(String value) {
            addCriterion("user1_id <", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLessThanOrEqualTo(String value) {
            addCriterion("user1_id <=", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdLike(String value) {
            addCriterion("user1_id like", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotLike(String value) {
            addCriterion("user1_id not like", value, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdIn(List<String> values) {
            addCriterion("user1_id in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotIn(List<String> values) {
            addCriterion("user1_id not in", values, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdBetween(String value1, String value2) {
            addCriterion("user1_id between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser1IdNotBetween(String value1, String value2) {
            addCriterion("user1_id not between", value1, value2, "user1Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNull() {
            addCriterion("user2_id is null");
            return (Criteria) this;
        }

        public Criteria andUser2IdIsNotNull() {
            addCriterion("user2_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser2IdEqualTo(String value) {
            addCriterion("user2_id =", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotEqualTo(String value) {
            addCriterion("user2_id <>", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThan(String value) {
            addCriterion("user2_id >", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdGreaterThanOrEqualTo(String value) {
            addCriterion("user2_id >=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThan(String value) {
            addCriterion("user2_id <", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLessThanOrEqualTo(String value) {
            addCriterion("user2_id <=", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdLike(String value) {
            addCriterion("user2_id like", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotLike(String value) {
            addCriterion("user2_id not like", value, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdIn(List<String> values) {
            addCriterion("user2_id in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotIn(List<String> values) {
            addCriterion("user2_id not in", values, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdBetween(String value1, String value2) {
            addCriterion("user2_id between", value1, value2, "user2Id");
            return (Criteria) this;
        }

        public Criteria andUser2IdNotBetween(String value1, String value2) {
            addCriterion("user2_id not between", value1, value2, "user2Id");
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