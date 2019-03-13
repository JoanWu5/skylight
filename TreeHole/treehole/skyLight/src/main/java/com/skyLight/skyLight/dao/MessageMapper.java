package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Message;
import com.skyLight.skyLight.entity.MessageExample;
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

public interface MessageMapper {
    @SelectProvider(type=MessageSqlProvider.class, method="countByExample")
    long countByExample(MessageExample example);

    @DeleteProvider(type=MessageSqlProvider.class, method="deleteByExample")
    int deleteByExample(MessageExample example);

    @Delete({
        "delete from message",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into message (id, content, time, ",
        "user1_id, user2_id)",
        "values (#{id,jdbcType=CHAR}, #{content,jdbcType=CHAR}, #{time,jdbcType=TIMESTAMP}, ",
        "#{user1Id,jdbcType=CHAR}, #{user2Id,jdbcType=CHAR})"
    })
    int insert(Message record);

    @InsertProvider(type=MessageSqlProvider.class, method="insertSelective")
    int insertSelective(Message record);

    @SelectProvider(type=MessageSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.CHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user1_id", property="user1Id", jdbcType=JdbcType.CHAR),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR)
    })
    List<Message> selectByExample(MessageExample example);

    @Select({
        "select",
        "id, content, time, user1_id, user2_id",
        "from message",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="content", property="content", jdbcType=JdbcType.CHAR),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user1_id", property="user1Id", jdbcType=JdbcType.CHAR),
        @Result(column="user2_id", property="user2Id", jdbcType=JdbcType.CHAR)
    })
    Message selectByPrimaryKey(String id);

    @UpdateProvider(type=MessageSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    @UpdateProvider(type=MessageSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    @UpdateProvider(type=MessageSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Message record);

    @Update({
        "update message",
        "set content = #{content,jdbcType=CHAR},",
          "time = #{time,jdbcType=TIMESTAMP},",
          "user1_id = #{user1Id,jdbcType=CHAR},",
          "user2_id = #{user2Id,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Message record);
}