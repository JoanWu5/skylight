package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Session;
import com.skyLight.skyLight.entity.SessionExample.Criteria;
import com.skyLight.skyLight.entity.SessionExample.Criterion;
import com.skyLight.skyLight.entity.SessionExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SessionSqlProvider {

    public String countByExample(SessionExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("session");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SessionExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("session");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Session record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("session");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlogId() != null) {
            sql.VALUES("blog_id", "#{blogId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernId() != null) {
            sql.VALUES("session_concern_id", "#{sessionConcernId,jdbcType=CHAR}");
        }
        
        if (record.getSessionArticleId() != null) {
            sql.VALUES("session_article_id", "#{sessionArticleId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernTotal() != null) {
            sql.VALUES("session_concern_total", "#{sessionConcernTotal,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(SessionExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("blog_id");
        sql.SELECT("session_concern_id");
        sql.SELECT("session_article_id");
        sql.SELECT("session_concern_total");
        sql.FROM("session");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Session record = (Session) parameter.get("record");
        SessionExample example = (SessionExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("session");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlogId() != null) {
            sql.SET("blog_id = #{record.blogId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernId() != null) {
            sql.SET("session_concern_id = #{record.sessionConcernId,jdbcType=CHAR}");
        }
        
        if (record.getSessionArticleId() != null) {
            sql.SET("session_article_id = #{record.sessionArticleId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernTotal() != null) {
            sql.SET("session_concern_total = #{record.sessionConcernTotal,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("session");
        
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("blog_id = #{record.blogId,jdbcType=CHAR}");
        sql.SET("session_concern_id = #{record.sessionConcernId,jdbcType=CHAR}");
        sql.SET("session_article_id = #{record.sessionArticleId,jdbcType=CHAR}");
        sql.SET("session_concern_total = #{record.sessionConcernTotal,jdbcType=INTEGER}");
        
        SessionExample example = (SessionExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Session record) {
        SQL sql = new SQL();
        sql.UPDATE("session");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getBlogId() != null) {
            sql.SET("blog_id = #{blogId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernId() != null) {
            sql.SET("session_concern_id = #{sessionConcernId,jdbcType=CHAR}");
        }
        
        if (record.getSessionArticleId() != null) {
            sql.SET("session_article_id = #{sessionArticleId,jdbcType=CHAR}");
        }
        
        if (record.getSessionConcernTotal() != null) {
            sql.SET("session_concern_total = #{sessionConcernTotal,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SessionExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}