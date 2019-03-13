package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.Label;
import com.skyLight.skyLight.entity.LabelExample;
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

public interface LabelMapper {
    @SelectProvider(type=LabelSqlProvider.class, method="countByExample")
    long countByExample(LabelExample example);

    @DeleteProvider(type=LabelSqlProvider.class, method="deleteByExample")
    int deleteByExample(LabelExample example);

    @Delete({
        "delete from label",
        "where id = #{id,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into label (id, name)",
        "values (#{id,jdbcType=CHAR}, #{name,jdbcType=CHAR})"
    })
    int insert(Label record);

    @InsertProvider(type=LabelSqlProvider.class, method="insertSelective")
    int insertSelective(Label record);

    @SelectProvider(type=LabelSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR)
    })
    List<Label> selectByExample(LabelExample example);

    @Select({
        "select",
        "id, name",
        "from label",
        "where id = #{id,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.CHAR)
    })
    Label selectByPrimaryKey(String id);

    @UpdateProvider(type=LabelSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Label record, @Param("example") LabelExample example);

    @UpdateProvider(type=LabelSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Label record, @Param("example") LabelExample example);

    @UpdateProvider(type=LabelSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Label record);

    @Update({
        "update label",
        "set name = #{name,jdbcType=CHAR}",
        "where id = #{id,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Label record);
}