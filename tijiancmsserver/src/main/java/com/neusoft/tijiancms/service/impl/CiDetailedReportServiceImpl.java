package com.neusoft.tijiancms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijiancms.mapper.CiDetailedReportMapper;
import com.neusoft.tijiancms.po.CiDetailedReport;
import com.neusoft.tijiancms.service.CiDetailedReportService;

@Service
public class CiDetailedReportServiceImpl implements CiDetailedReportService{

	@Autowired
	private CiDetailedReportMapper ciDetailedReportMapper;

	@Override
	public int updateCiDetailedReport(List<CiDetailedReport> list) {
		// TODO Auto-generated method stub
		return ciDetailedReportMapper.updateCiDetailedReport(list);
	}
	
	
}
