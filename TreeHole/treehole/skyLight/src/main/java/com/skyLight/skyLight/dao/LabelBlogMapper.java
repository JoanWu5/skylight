package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.LabelBlogExample;
import com.skyLight.skyLight.entity.LabelBlogKey;
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

public interface LabelBlogMapper {
    @SelectProvider(type=LabelBlogSqlProvider.class, method="countByExample")
    long countByExample(LabelBlogExample example);

    @DeleteProvider(type=LabelBlogSqlProvider.class, method="deleteByExample")
    int deleteByExample(LabelBlogExample example);

    @Delete({
        "delete from label_blog",
        "where id = #{id,jdbcType=CHAR}",
          "and lab_id = #{labId,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(LabelBlogKey key);

    @Insert({
        "insert into label_blog (id, lab_id)",
        "values (#{id,jdbcType=CHAR}, #{labId,jdbcType=CHAR})"
    })
    int insert(LabelBlogKey record);

    @InsertProvider(type=LabelBlogSqlProvider.class, method="insertSelective")
    int insertSelective(LabelBlogKey record);

    @SelectProvider(type=LabelBlogSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="lab_id", property="labId", jdbcType=JdbcType.CHAR, id=true)
    })
    List<LabelBlogKey> selectByExample(LabelBlogExample example);

    @UpdateProvider(type=LabelBlogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") LabelBlogKey record, @Param("example") LabelBlogExample example);

    @UpdateProvider(type=LabelBlogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") LabelBlogKey record, @Param("example") LabelBlogExample example);
}