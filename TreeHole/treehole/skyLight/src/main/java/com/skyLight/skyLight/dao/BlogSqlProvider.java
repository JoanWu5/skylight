package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Blog;
import com.skyLight.skyLight.entity.BlogExample.Criteria;
import com.skyLight.skyLight.entity.BlogExample.Criterion;
import com.skyLight.skyLight.entity.BlogExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class BlogSqlProvider {

    public String countByExample(BlogExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("blog");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(BlogExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("blog");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Blog record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("blog");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=CHAR}");
        }
        
        if (record.getAuthorName() != null) {
            sql.VALUES("author_name", "#{authorName,jdbcType=CHAR}");
        }
        
        if (record.getAuthorId() != null) {
            sql.VALUES("author_id", "#{authorId,jdbcType=CHAR}");
        }
        
        if (record.getVisableLevel() != null) {
            sql.VALUES("visable_level", "#{visableLevel,jdbcType=DECIMAL}");
        }
        
        if (record.getCoverId() != null) {
            sql.VALUES("cover_id", "#{coverId,jdbcType=CHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=CHAR}");
        }
        
        if (record.getPageViews() != null) {
            sql.VALUES("page_views", "#{pageViews,jdbcType=DECIMAL}");
        }
        
        if (record.getTime() != null) {
            sql.VALUES("time", "#{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPraise() != null) {
            sql.VALUES("praise", "#{praise,jdbcType=DECIMAL}");
        }
        
        if (record.getComments() != null) {
            sql.VALUES("comments", "#{comments,jdbcType=INTEGER}");
        }
        
        if (record.getSummary() != null) {
            sql.VALUES("summary", "#{summary,jdbcType=LONGVARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExampleWithBLOBs(BlogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("author_name");
        sql.SELECT("author_id");
        sql.SELECT("visable_level");
        sql.SELECT("cover_id");
        sql.SELECT("title");
        sql.SELECT("page_views");
        sql.SELECT("time");
        sql.SELECT("praise");
        sql.SELECT("comments");
        sql.SELECT("summary");
        sql.FROM("blog");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String selectByExample(BlogExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("author_name");
        sql.SELECT("author_id");
        sql.SELECT("visable_level");
        sql.SELECT("cover_id");
        sql.SELECT("title");
        sql.SELECT("page_views");
        sql.SELECT("time");
        sql.SELECT("praise");
        sql.SELECT("comments");
        sql.FROM("blog");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Blog record = (Blog) parameter.get("record");
        BlogExample example = (BlogExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("blog");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=CHAR}");
        }
        
        if (record.getAuthorName() != null) {
            sql.SET("author_name = #{record.authorName,jdbcType=CHAR}");
        }
        
        if (record.getAuthorId() != null) {
            sql.SET("author_id = #{record.authorId,jdbcType=CHAR}");
        }
        
        if (record.getVisableLevel() != null) {
            sql.SET("visable_level = #{record.visableLevel,jdbcType=DECIMAL}");
        }
        
        if (record.getCoverId() != null) {
            sql.SET("cover_id = #{record.coverId,jdbcType=CHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=CHAR}");
        }
        
        if (record.getPageViews() != null) {
            sql.SET("page_views = #{record.pageViews,jdbcType=DECIMAL}");
        }
        
        if (record.getTime() != null) {
            sql.SET("time = #{record.time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPraise() != null) {
            sql.SET("praise = #{record.praise,jdbcType=DECIMAL}");
        }
        
        if (record.getComments() != null) {
            sql.SET("comments = #{record.comments,jdbcType=INTEGER}");
        }
        
        if (record.getSummary() != null) {
            sql.SET("summary = #{record.summary,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("blog");
        
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("author_name = #{record.authorName,jdbcType=CHAR}");
        sql.SET("author_id = #{record.authorId,jdbcType=CHAR}");
        sql.SET("visable_level = #{record.visableLevel,jdbcType=DECIMAL}");
        sql.SET("cover_id = #{record.coverId,jdbcType=CHAR}");
        sql.SET("title = #{record.title,jdbcType=CHAR}");
        sql.SET("page_views = #{record.pageViews,jdbcType=DECIMAL}");
        sql.SET("time = #{record.time,jdbcType=TIMESTAMP}");
        sql.SET("praise = #{record.praise,jdbcType=DECIMAL}");
        sql.SET("comments = #{record.comments,jdbcType=INTEGER}");
        sql.SET("summary = #{record.summary,jdbcType=LONGVARCHAR}");
        
        BlogExample example = (BlogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("blog");
        
        sql.SET("id = #{record.id,jdbcType=CHAR}");
        sql.SET("author_name = #{record.authorName,jdbcType=CHAR}");
        sql.SET("author_id = #{record.authorId,jdbcType=CHAR}");
        sql.SET("visable_level = #{record.visableLevel,jdbcType=DECIMAL}");
        sql.SET("cover_id = #{record.coverId,jdbcType=CHAR}");
        sql.SET("title = #{record.title,jdbcType=CHAR}");
        sql.SET("page_views = #{record.pageViews,jdbcType=DECIMAL}");
        sql.SET("time = #{record.time,jdbcType=TIMESTAMP}");
        sql.SET("praise = #{record.praise,jdbcType=DECIMAL}");
        sql.SET("comments = #{record.comments,jdbcType=INTEGER}");
        
        BlogExample example = (BlogExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Blog record) {
        SQL sql = new SQL();
        sql.UPDATE("blog");
        
        if (record.getAuthorName() != null) {
            sql.SET("author_name = #{authorName,jdbcType=CHAR}");
        }
        
        if (record.getAuthorId() != null) {
            sql.SET("author_id = #{authorId,jdbcType=CHAR}");
        }
        
        if (record.getVisableLevel() != null) {
            sql.SET("visable_level = #{visableLevel,jdbcType=DECIMAL}");
        }
        
        if (record.getCoverId() != null) {
            sql.SET("cover_id = #{coverId,jdbcType=CHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=CHAR}");
        }
        
        if (record.getPageViews() != null) {
            sql.SET("page_views = #{pageViews,jdbcType=DECIMAL}");
        }
        
        if (record.getTime() != null) {
            sql.SET("time = #{time,jdbcType=TIMESTAMP}");
        }
        
        if (record.getPraise() != null) {
            sql.SET("praise = #{praise,jdbcType=DECIMAL}");
        }
        
        if (record.getComments() != null) {
            sql.SET("comments = #{comments,jdbcType=INTEGER}");
        }
        
        if (record.getSummary() != null) {
            sql.SET("summary = #{summary,jdbcType=LONGVARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=CHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, BlogExample example, boolean includeExamplePhrase) {
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