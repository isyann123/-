package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.CiDetailedReport;

@Mapper
public interface CiDetailedReportMapper {

	public int saveCiDetailedReport(List<CiDetailedReport> list);
	
	@Select("select * from ciDetailedReport where ciId=#{ciId} and orderId=#{orderId} order by cidrId")
	public List<CiDetailedReport> listCiDetailedReportByOrderIdByCiId(CiDetailedReport ciDetailedReport);

	public int updateCiDetailedReport(List<CiDetailedReport> list);
}
