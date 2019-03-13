package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Praise;
import com.skyLight.skyLight.entity.PraiseExample;
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

public interface PraiseMapper {
    @SelectProvider(type=PraiseSqlProvider.class, method="countByExample")
    long countByExample(PraiseExample example);

    @DeleteProvider(type=PraiseSqlProvider.class, method="deleteByExample")
    int deleteByExample(PraiseExample example);

    @Delete({
        "delete from praise",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into praise (id, time, ",
        "blog_id, user1_id, user2_id)",
        "values (#{id,jdbcType=CHAR}, #{time,jdbcType=TIMESTAMP}, ",
        "#{blogId,jdbcType=CHAR}, #{user1Id,jdbcType=CHAR}, #{user2Id,jdbcType=CHAR})"
    })
    int insert(Praise record);

    @InsertProvider(type=PraiseSqlProvider.class, method="insertSelective")
    int insertSelective(Praise record);

    @SelectProvider(type=PraiseSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR),
        @Result(column="user1_id", property="user1Id", jdbcType=JdbcType.CHAR),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR)
    })
    List<Praise> selectByExample(PraiseExample example);

    @Select({
        "select",
        "id, time, blog_id, user1_id, user2_id",
        "from praise",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="blog_id", property="blogId", jdbcType=JdbcType.CHAR),
        @Result(column="user1_id", property="user1Id", jdbcType=JdbcType.CHAR),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR)
    })
    Praise selectByPrimaryKey(String id);

    @UpdateProvider(type=PraiseSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Praise record, @Param("example") PraiseExample example);

    @UpdateProvider(type=PraiseSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Praise record, @Param("example") PraiseExample example);

    @UpdateProvider(type=PraiseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Praise record);

    @Update({
        "update praise",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "blog_id = #{blogId,jdbcType=CHAR},",
          "user1_id = #{user1Id,jdbcType=CHAR},",
          "user2_id = #{user2Id,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Praise record);
}