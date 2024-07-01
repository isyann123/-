package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.CiReport;

@Mapper
public interface CiReportMapper {

	@Select("select count(*) from ciReport where orderId=#{orderId}")
	public int getCiReportByOrderId(Integer orderId);
	
	public int saveCiReport(List<CiReport> list);
	
	@Select("select * from ciReport where orderId=#{orderId}")
	public List<CiReport> listCiReport(Integer orderId);
}
