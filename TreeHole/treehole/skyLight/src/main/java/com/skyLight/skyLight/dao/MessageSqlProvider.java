package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Message;
import com.skyLight.skyLight.entity.MessageExample.Criteria;
import com.skyLight.skyLight.entity.MessageExample.Criterion;
import com.skyLight.skyLight.entity.MessageExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class MessageSqlProvider {

    public String countByExample(MessageExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(MessageExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("message");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Message record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("message");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=CHAR}");
        }
        
        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUser1Id() != null) {
            sql.VALUES("user1_id", "#{user1Id,jdbcType=CHAR}");
        }
        
        if (record.getUser2Id() != null) {
            sql.VALUES("user2_id", "#{user2Id,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(MessageExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("content");
        sql.SELECT("time");
        sql.SELECT("user1_id");
        sql.SELECT("user2_id");
        sql.FROM("message");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Message record = (Message) parameter.get("record");
        MessageExample example = (MessageExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("message");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getContent() != null) {
            sql.SET("content = #{record.content,jdbcType=CHAR}");
        }
        
        if (record.getTime() != null) {
            sql.SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUser1Id() != null) {
            sql.SET("user1_id = #{record.user1Id,jdbcType=CHAR}");
        }
        
        if (record.getUser2Id() != null) {
            sql.SET("user2_id = #{record.user2Id,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("message");
        
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("content = #{record.content,jdbcType=CHAR}");
        sql.SET("time = #{record.time,jdbcType=TIMESTAMP}");
        sql.SET("user1_id = #{record.user1Id,jdbcType=CHAR}");
        sql.SET("user2_id = #{record.user2Id,jdbcType=CHAR}");
        
        MessageExample example = (MessageExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Message record) {
        SQL sql = new SQL();
        sql.UPDATE("message");
        
        if (record.getContent() != null) {
            sql.SET("content = #{content,jdbcType=CHAR}");
        }
        
        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUser1Id() != null) {
            sql.SET("user1_id = #{user1Id,jdbcType=CHAR}");
        }
        
        if (record.getUser2Id() != null) {
            sql.SET("user2_id = #{user2Id,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, MessageExample example, boolean includeExamplePhrase) {
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