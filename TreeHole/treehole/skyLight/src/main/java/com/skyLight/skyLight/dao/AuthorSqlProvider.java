package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Author;
import com.skyLight.skyLight.entity.AuthorExample.Criteria;
import com.skyLight.skyLight.entity.AuthorExample.Criterion;
import com.skyLight.skyLight.entity.AuthorExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class AuthorSqlProvider {

    public String countByExample(AuthorExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("author");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(AuthorExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("author");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Author record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("author");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getConcernTotal() != null) {
            sql.VALUES("concern_total", "#{concernTotal,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseTotal() != null) {
            sql.VALUES("praise_total", "#{praiseTotal,jdbcType=INTEGER}");
        }
        
        if (record.getArticleTotal() != null) {
            sql.VALUES("article_total", "#{articleTotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommentTotal() != null) {
            sql.VALUES("comment_total", "#{commentTotal,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.VALUES("sex", "#{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIntro() != null) {
            sql.VALUES("intro", "#{intro,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=CHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(AuthorExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("name");
        sql.SELECT("concern_total");
        sql.SELECT("praise_total");
        sql.SELECT("article_total");
        sql.SELECT("comment_total");
        sql.SELECT("sex");
        sql.SELECT("intro");
        sql.SELECT("user_id");
        sql.FROM("author");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Author record = (Author) parameter.get("record");
        AuthorExample example = (AuthorExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("author");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getConcernTotal() != null) {
            sql.SET("concern_total = #{record.concernTotal,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseTotal() != null) {
            sql.SET("praise_total = #{record.praiseTotal,jdbcType=INTEGER}");
        }
        
        if (record.getArticleTotal() != null) {
            sql.SET("article_total = #{record.articleTotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommentTotal() != null) {
            sql.SET("comment_total = #{record.commentTotal,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{record.sex,jdbcType=INTEGER}");
        }
        
        if (record.getIntro() != null) {
            sql.SET("intro = #{record.intro,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=CHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("author");
        
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("name = #{record.name,jdbcType=VARCHAR}");
        sql.SET("concern_total = #{record.concernTotal,jdbcType=INTEGER}");
        sql.SET("praise_total = #{record.praiseTotal,jdbcType=INTEGER}");
        sql.SET("article_total = #{record.articleTotal,jdbcType=INTEGER}");
        sql.SET("comment_total = #{record.commentTotal,jdbcType=INTEGER}");
        sql.SET("sex = #{record.sex,jdbcType=INTEGER}");
        sql.SET("intro = #{record.intro,jdbcType=VARCHAR}");
        sql.SET("user_id = #{record.userId,jdbcType=CHAR}");
        
        AuthorExample example = (AuthorExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Author record) {
        SQL sql = new SQL();
        sql.UPDATE("author");
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getConcernTotal() != null) {
            sql.SET("concern_total = #{concernTotal,jdbcType=INTEGER}");
        }
        
        if (record.getPraiseTotal() != null) {
            sql.SET("praise_total = #{praiseTotal,jdbcType=INTEGER}");
        }
        
        if (record.getArticleTotal() != null) {
            sql.SET("article_total = #{articleTotal,jdbcType=INTEGER}");
        }
        
        if (record.getCommentTotal() != null) {
            sql.SET("comment_total = #{commentTotal,jdbcType=INTEGER}");
        }
        
        if (record.getSex() != null) {
            sql.SET("sex = #{sex,jdbcType=INTEGER}");
        }
        
        if (record.getIntro() != null) {
            sql.SET("intro = #{intro,jdbcType=VARCHAR}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=CHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, AuthorExample example, boolean includeExamplePhrase) {
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