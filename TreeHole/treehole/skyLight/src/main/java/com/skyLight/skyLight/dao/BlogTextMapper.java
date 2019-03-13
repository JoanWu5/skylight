package com.skyLight.skyLight.dao;

import com.skyLight.skyLight.entity.BlogText;
import com.skyLight.skyLight.entity.BlogTextExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BlogTextMapper {
    @SelectProvider(type=BlogTextSqlProvider.class, method="countByExample")
    long countByExample(BlogTextExample example);

    @DeleteProvider(type=BlogTextSqlProvider.class, method="deleteByExample")
    int deleteByExample(BlogTextExample example);

    @Insert({
        "insert into blogText (blogId, text)",
        "values (#{blogid,jdbcType=CHAR}, #{text,jdbcType=LONGVARCHAR})"
    })
    int insert(BlogText record);

    @InsertProvider(type=BlogTextSqlProvider.class, method="insertSelective")
    int insertSelective(BlogText record);

    @SelectProvider(type=BlogTextSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="blogId", property="blogid", jdbcType=JdbcType.CHAR),
        @Result(column="text", property="text", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BlogText> selectByExampleWithBLOBs(BlogTextExample example);

    @SelectProvider(type=BlogTextSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="blogId", property="blogid", jdbcType=JdbcType.CHAR)
    })
    List<BlogText> selectByExample(BlogTextExample example);

    @UpdateProvider(type=BlogTextSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BlogText record, @Param("example") BlogTextExample example);

    @UpdateProvider(type=BlogTextSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") BlogText record, @Param("example") BlogTextExample example);

    @UpdateProvider(type=BlogTextSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BlogText record, @Param("example") BlogTextExample example);
}