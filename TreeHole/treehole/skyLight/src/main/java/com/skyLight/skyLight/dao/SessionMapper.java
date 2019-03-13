package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Session;
import com.skyLight.skyLight.entity.SessionExample;
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

public interface SessionMapper {
    @SelectProvider(type=SessionSqlProvider.class, method="countByExample")
    long countByExample(SessionExample example);

    @DeleteProvider(type=SessionSqlProvider.class, method="deleteByExample")
    int deleteByExample(SessionExample example);

    @Delete({
        "delete from session",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into session (id, name, blog_id, ",
        "session_concern_id, session_article_id, ",
        "session_concern_total)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{blogId,jdbcType=CHAR}, ",
        "#{sessionConcernId,jdbcType=CHAR}, #{sessionArticleId,jdbcType=CHAR}, ",
        "#{sessionConcernTotal,jdbcType=INTEGER})"
    })
    int insert(Session record);

    @InsertProvider(type=SessionSqlProvider.class, method="insertSelective")
    int insertSelective(Session record);

    @SelectProvider(type=SessionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR),
        @Result(column="session_concern_id", property="sessionConcernId", jdbcType=JdbcType.CHAR),
        @Result(column="session_article_id", property="sessionArticleId", jdbcType=JdbcType.CHAR),
        @Result(column="session_concern_total", property="sessionConcernTotal", jdbcType=JdbcType.INTEGER)
    })
    List<Session> selectByExample(SessionExample example);

    @Select({
        "select",
        "id, name, blog_id, session_concern_id, session_article_id, session_concern_total",
        "from session",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR),
        @Result(column="session_concern_id", property="sessionConcernId", jdbcType=JdbcType.CHAR),
        @Result(column="session_article_id", property="sessionArticleId", jdbcType=JdbcType.CHAR),
        @Result(column="session_concern_total", property="sessionConcernTotal", jdbcType=JdbcType.INTEGER)
    })
    Session selectByPrimaryKey(String id);

    @UpdateProvider(type=SessionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    @UpdateProvider(type=SessionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    @UpdateProvider(type=SessionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Session record);

    @Update({
        "update session",
        "set name = #{name,jdbcType=VARCHAR},",
          "blog_id = #{blogId,jdbcType=CHAR},",
          "session_concern_id = #{sessionConcernId,jdbcType=CHAR},",
          "session_article_id = #{sessionArticleId,jdbcType=CHAR},",
          "session_concern_total = #{sessionConcernTotal,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Session record);
}