package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.UserBlogComment;
import com.skyLight.skyLight.entity.UserBlogCommentExample;
import com.skyLight.skyLight.entity.UserBlogCommentKey;
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

public interface UserBlogCommentMapper {
    @SelectProvider(type=UserBlogCommentSqlProvider.class, method="countByExample")
    long countByExample(UserBlogCommentExample example);

    @DeleteProvider(type=UserBlogCommentSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserBlogCommentExample example);

    @Delete({
        "delete from user_blog_comment",
        "where com_id = #{comId,jdbcType=CHAR}",
          "and id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(UserBlogCommentKey key);

    @Insert({
        "insert into user_blog_comment (com_id, id, use_id)",
        "values (#{comId,jdbcType=CHAR}, #{id,jdbcType=CHAR}, #{useId,jdbcType=CHAR})"
    })
    int insert(UserBlogComment record);

    @InsertProvider(type=UserBlogCommentSqlProvider.class, method="insertSelective")
    int insertSelective(UserBlogComment record);

    @SelectProvider(type=UserBlogCommentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="com_id", property="comId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="use_id", property="useId", jdbcType=JdbcType.CHAR)
    })
    List<UserBlogComment> selectByExample(UserBlogCommentExample example);

    @Select({
        "select",
        "com_id, id, use_id",
        "from user_blog_comment",
        "where com_id = #{comId,jdbcType=CHAR}",
          "and id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="com_id", property="comId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="use_id", property="useId", jdbcType=JdbcType.CHAR)
    })
    UserBlogComment selectByPrimaryKey(UserBlogCommentKey key);

    @UpdateProvider(type=UserBlogCommentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") UserBlogComment record, @Param("example") UserBlogCommentExample example);

    @UpdateProvider(type=UserBlogCommentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") UserBlogComment record, @Param("example") UserBlogCommentExample example);

    @UpdateProvider(type=UserBlogCommentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UserBlogComment record);

    @Update({
        "update user_blog_comment",
        "set use_id = #{useId,jdbcType=CHAR}",
        "where com_id = #{comId,jdbcType=CHAR}",
          "and id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(UserBlogComment record);
}