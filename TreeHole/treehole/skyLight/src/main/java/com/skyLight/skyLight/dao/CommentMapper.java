package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Comment;
import com.skyLight.skyLight.entity.CommentExample;
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

public interface CommentMapper {
    @SelectProvider(type=CommentSqlProvider.class, method="countByExample")
    long countByExample(CommentExample example);

    @DeleteProvider(type=CommentSqlProvider.class, method="deleteByExample")
    int deleteByExample(CommentExample example);

    @Delete({
        "delete from comment",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into comment (id, content, user_id, ",
        "time, user2_id, blog_id)",
        "values (#{id,jdbcType=CHAR}, #{content,jdbcType=CHAR}, #{userId,jdbcType=CHAR}, ",
        "#{time,jdbcType=TIMESTAMP}, #{user2Id,jdbcType=CHAR}, #{blogId,jdbcType=CHAR})"
    })
    int insert(Comment record);

    @InsertProvider(type=CommentSqlProvider.class, method="insertSelective")
    int insertSelective(Comment record);

    @SelectProvider(type=CommentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR)
    })
    List<Comment> selectByExample(CommentExample example);

    @Select({
        "select",
        "id, content, user_id, time, user2_id, blog_id",
        "from comment",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR)
    })
    Comment selectByPrimaryKey(String id);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    @UpdateProvider(type=CommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Comment record);

    @Update({
        "update comment",
        "set content = #{content,jdbcType=CHAR},",
          "user_id = #{userId,jdbcType=CHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "user2_id = #{user2Id,jdbcType=CHAR},",
          "blog_id = #{blogId,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Comment record);
}