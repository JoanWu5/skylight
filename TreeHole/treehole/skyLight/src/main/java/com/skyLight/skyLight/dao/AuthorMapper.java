package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Author;
import com.skyLight.skyLight.entity.AuthorExample;
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

public interface AuthorMapper {
    @SelectProvider(type=AuthorSqlProvider.class, method="countByExample")
    long countByExample(AuthorExample example);

    @DeleteProvider(type=AuthorSqlProvider.class, method="deleteByExample")
    int deleteByExample(AuthorExample example);

    @Delete({
        "delete from author",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into author (id, name, concern_total, ",
        "praise_total, article_total, ",
        "comment_total, sex, ",
        "intro, user_id)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, #{concernTotal,jdbcType=INTEGER}, ",
        "#{praiseTotal,jdbcType=INTEGER}, #{articleTotal,jdbcType=INTEGER}, ",
        "#{commentTotal,jdbcType=INTEGER}, #{sex,jdbcType=INTEGER}, ",
        "#{intro,jdbcType=VARCHAR}, #{userId,jdbcType=CHAR})"
    })
    int insert(Author record);

    @InsertProvider(type=AuthorSqlProvider.class, method="insertSelective")
    int insertSelective(Author record);

    @SelectProvider(type=AuthorSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="concern_total", property="concernTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="praise_total", property="praiseTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="article_total", property="articleTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_total", property="commentTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="intro", property="intro", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR)
    })
    List<Author> selectByExample(AuthorExample example);

    @Select({
        "select",
        "id, name, concern_total, praise_total, article_total, comment_total, sex, intro, ",
        "user_id",
        "from author",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="concern_total", property="concernTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="praise_total", property="praiseTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="article_total", property="articleTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="comment_total", property="commentTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="sex", property="sex", jdbcType=JdbcType.INTEGER),
        @Result(column="intro", property="intro", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR)
    })
    Author selectByPrimaryKey(String id);

    @UpdateProvider(type=AuthorSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Author record, @Param("example") AuthorExample example);

    @UpdateProvider(type=AuthorSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Author record, @Param("example") AuthorExample example);

    @UpdateProvider(type=AuthorSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Author record);

    @Update({
        "update author",
        "set name = #{name,jdbcType=VARCHAR},",
          "concern_total = #{concernTotal,jdbcType=INTEGER},",
          "praise_total = #{praiseTotal,jdbcType=INTEGER},",
          "article_total = #{articleTotal,jdbcType=INTEGER},",
          "comment_total = #{commentTotal,jdbcType=INTEGER},",
          "sex = #{sex,jdbcType=INTEGER},",
          "intro = #{intro,jdbcType=VARCHAR},",
          "user_id = #{userId,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Author record);
}