package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Blog;
import com.skyLight.skyLight.entity.BlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BlogMapper {
    @SelectProvider(type=BlogSqlProvider.class, method="countByExample")
    long countByExample(BlogExample example);

    @DeleteProvider(type=BlogSqlProvider.class, method="deleteByExample")
    int deleteByExample(BlogExample example);

    @Delete({
        "delete from blog",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into blog (id, author_name, ",
        "author_id, visable_level, ",
        "cover_id, title, page_views, ",
        "time, praise, ",
        "comments, summary)",
        "values (#{id,jdbcType=CHAR}, #{authorName,jdbcType=CHAR}, ",
        "#{authorId,jdbcType=CHAR}, #{visableLevel,jdbcType=DECIMAL}, ",
        "#{coverId,jdbcType=CHAR}, #{title,jdbcType=CHAR}, #{pageViews,jdbcType=DECIMAL}, ",
        "#{time,jdbcType=TIMESTAMP}, #{praise,jdbcType=DECIMAL}, ",
        "#{comments,jdbcType=INTEGER}, #{summary,jdbcType=LONGVARCHAR})"
    })
    int insert(Blog record);

    @InsertProvider(type=BlogSqlProvider.class, method="insertSelective")
    int insertSelective(Blog record);

    @SelectProvider(type=BlogSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="author_name", property="authorName", jdbcType=JdbcType.CHAR),
        @Result(column="author_id", property="authorId", jdbcType=JdbcType.CHAR),
        @Result(column="visable_level", property="visableLevel", jdbcType=JdbcType.DECIMAL),
        @Result(column="cover_id", property="coverId", jdbcType=JdbcType.CHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.CHAR),
        @Result(column="page_views", property="pageViews", jdbcType=JdbcType.DECIMAL),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="praise", property="praise", jdbcType=JdbcType.DECIMAL),
        @Result(column="comments", property="comments", jdbcType=JdbcType.INTEGER),
        @Result(column="summary", property="summary", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    @SelectProvider(type=BlogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="author_name", property="authorName", jdbcType=JdbcType.CHAR),
        @Result(column="author_id", property="authorId", jdbcType=JdbcType.CHAR),
        @Result(column="visable_level", property="visableLevel", jdbcType=JdbcType.DECIMAL),
        @Result(column="cover_id", property="coverId", jdbcType=JdbcType.CHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.CHAR),
        @Result(column="page_views", property="pageViews", jdbcType=JdbcType.DECIMAL),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="praise", property="praise", jdbcType=JdbcType.DECIMAL),
        @Result(column="comments", property="comments", jdbcType=JdbcType.INTEGER)
    })
    List<Blog> selectByExample(BlogExample example);

    @Select({
        "select",
        "id, author_name, author_id, visable_level, cover_id, title, page_views, time, ",
        "praise, comments, summary",
        "from blog",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="author_name", property="authorName", jdbcType=JdbcType.CHAR),
        @Result(column="author_id", property="authorId", jdbcType=JdbcType.CHAR),
        @Result(column="visable_level", property="visableLevel", jdbcType=JdbcType.DECIMAL),
        @Result(column="cover_id", property="coverId", jdbcType=JdbcType.CHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.CHAR),
        @Result(column="page_views", property="pageViews", jdbcType=JdbcType.DECIMAL),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="praise", property="praise", jdbcType=JdbcType.DECIMAL),
        @Result(column="comments", property="comments", jdbcType=JdbcType.INTEGER),
        @Result(column="summary", property="summary", jdbcType=JdbcType.LONGVARCHAR)
    })
    Blog selectByPrimaryKey(String id);

    @UpdateProvider(type=BlogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    @UpdateProvider(type=BlogSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    @UpdateProvider(type=BlogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

    @UpdateProvider(type=BlogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Blog record);

    @Update({
        "update blog",
        "set author_name = #{authorName,jdbcType=CHAR},",
          "author_id = #{authorId,jdbcType=CHAR},",
          "visable_level = #{visableLevel,jdbcType=DECIMAL},",
          "cover_id = #{coverId,jdbcType=CHAR},",
          "title = #{title,jdbcType=CHAR},",
          "page_views = #{pageViews,jdbcType=DECIMAL},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "praise = #{praise,jdbcType=DECIMAL},",
          "comments = #{comments,jdbcType=INTEGER},",
          "summary = #{summary,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKeyWithBLOBs(Blog record);

    @Update({
        "update blog",
        "set author_name = #{authorName,jdbcType=CHAR},",
          "author_id = #{authorId,jdbcType=CHAR},",
          "visable_level = #{visableLevel,jdbcType=DECIMAL},",
          "cover_id = #{coverId,jdbcType=CHAR},",
          "title = #{title,jdbcType=CHAR},",
          "page_views = #{pageViews,jdbcType=DECIMAL},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "praise = #{praise,jdbcType=DECIMAL},",
          "comments = #{comments,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Blog record);
}