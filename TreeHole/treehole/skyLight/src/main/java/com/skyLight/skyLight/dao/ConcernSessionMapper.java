package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.ConcernSession;
import com.skyLight.skyLight.entity.ConcernSessionExample;
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

public interface ConcernSessionMapper {
    @SelectProvider(type=ConcernSessionSqlProvider.class, method="countByExample")
    long countByExample(ConcernSessionExample example);

    @DeleteProvider(type=ConcernSessionSqlProvider.class, method="deleteByExample")
    int deleteByExample(ConcernSessionExample example);

    @Delete({
        "delete from concern_session",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into concern_session (id, time, ",
        "session_id, user_id)",
        "values (#{id,jdbcType=CHAR}, #{time,jdbcType=TIMESTAMP}, ",
        "#{sessionId,jdbcType=CHAR}, #{userId,jdbcType=CHAR})"
    })
    int insert(ConcernSession record);

    @InsertProvider(type=ConcernSessionSqlProvider.class, method="insertSelective")
    int insertSelective(ConcernSession record);

    @SelectProvider(type=ConcernSessionSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="session_id", property="sessionId", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR)
    })
    List<ConcernSession> selectByExample(ConcernSessionExample example);

    @Select({
        "select",
        "id, time, session_id, user_id",
        "from concern_session",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="time", property="time", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="session_id", property="sessionId", jdbcType=JdbcType.CHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.CHAR)
    })
    ConcernSession selectByPrimaryKey(String id);

    @UpdateProvider(type=ConcernSessionSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ConcernSession record, @Param("example") ConcernSessionExample example);

    @UpdateProvider(type=ConcernSessionSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ConcernSession record, @Param("example") ConcernSessionExample example);

    @UpdateProvider(type=ConcernSessionSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ConcernSession record);

    @Update({
        "update concern_session",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "session_id = #{sessionId,jdbcType=CHAR},",
          "user_id = #{userId,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(ConcernSession record);
}