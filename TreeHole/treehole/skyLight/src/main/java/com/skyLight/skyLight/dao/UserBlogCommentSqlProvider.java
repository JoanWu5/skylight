package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.UserBlogComment;
import com.skyLight.skyLight.entity.UserBlogCommentExample.Criteria;
import com.skyLight.skyLight.entity.UserBlogCommentExample.Criterion;
import com.skyLight.skyLight.entity.UserBlogCommentExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class UserBlogCommentSqlProvider {

    public String countByExample(UserBlogCommentExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("user_blog_comment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(UserBlogCommentExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("user_blog_comment");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(UserBlogComment record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user_blog_comment");
        
        if (record.getComId() != null) {
            sql.VALUES("com_id", "#{comId,jdbcType=CHAR}");
        }
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getUseId() != null) {
            sql.VALUES("use_id", "#{useId,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UserBlogCommentExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("com_id");
        } else {
            sql.SELECT("com_id");
        }
        sql.SELECT("id");
        sql.SELECT("use_id");
        sql.FROM("user_blog_comment");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        UserBlogComment record = (UserBlogComment) parameter.get("record");
        UserBlogCommentExample example = (UserBlogCommentExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("user_blog_comment");
        
        if (record.getComId() != null) {
            sql.SET("com_id = #{record.comId,jdbcType=CHAR}");
        }
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getUseId() != null) {
            sql.SET("use_id = #{record.useId,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("user_blog_comment");
        
        sql.SET("com_id = #{record.comId,jdbcType=CHAR}");
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("use_id = #{record.useId,jdbcType=CHAR}");
        
        UserBlogCommentExample example = (UserBlogCommentExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UserBlogComment record) {
        SQL sql = new SQL();
        sql.UPDATE("user_blog_comment");
        
        if (record.getUseId() != null) {
            sql.SET("use_id = #{useId,jdbcType=CHAR}");
        }
        
        sql.WHERE("com_id = #{comId,jdbcType=CHAR}");
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UserBlogCommentExample example, boolean includeExamplePhrase) {
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