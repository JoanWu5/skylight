package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.LabelUserExample;
import com.skyLight.skyLight.entity.LabelUserKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface LabelUserMapper {
    @SelectProvider(type=LabelUserSqlProvider.class, method="countByExample")
    long countByExample(LabelUserExample example);

    @DeleteProvider(type=LabelUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(LabelUserExample example);

    @Delete({
        "delete from label_user",
        "where use_id = #{useId,jdbcType=CHAR}",
          "and id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(LabelUserKey key);

    @Insert({
        "insert into label_user (use_id, id)",
        "values (#{useId,jdbcType=CHAR}, #{id,jdbcType=CHAR})"
    })
    int insert(LabelUserKey record);

    @InsertProvider(type=LabelUserSqlProvider.class, method="insertSelective")
    int insertSelective(LabelUserKey record);

    @SelectProvider(type=LabelUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="use_id", property="useId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true)
    })
    List<LabelUserKey> selectByExample(LabelUserExample example);

    @UpdateProvider(type=LabelUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LabelUserKey record, @Param("example") LabelUserExample example);

    @UpdateProvider(type=LabelUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LabelUserKey record, @Param("example") LabelUserExample example);
}