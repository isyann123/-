package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.neusoft.tijiancms.po.OverallResult;

@Mapper
public interface OverallResultMapper {

	@Select("select * from overallResult where orderId=#{orderId} order by orid")
	public List<OverallResult> listOverallResultByOrderId(Integer orderId);
	
	@Insert("insert into overallResult values(null,#{title},#{content},#{orderId})")
	public int saveOverallResult(OverallResult overallResult);
	@Update("update into overallResult set title=#{title},content=#{content} where orId=#{orId}")
	public int upadteOverallResult(OverallResult overallResult);
	@Delete("delete from overallResult where orId=#{orId}")
	public int removeOverallResult(Integer orId);
	
	
}
