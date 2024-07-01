package com.neusoft.tijiancms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijiancms.po.CiDetailedReport;
import com.neusoft.tijiancms.service.CiDetailedReportService;

@RestController
@RequestMapping("/ciDetailedReport")
public class CiDetailedReportController {
	
	@Autowired
	private CiDetailedReportService ciDetailedReportService;
	
	@RequestMapping("/updateCiDetailedReport")
	public int updateCiDetailedReport(@RequestBody List<CiDetailedReport> list) {
		return ciDetailedReportService.updateCiDetailedReport(list);
	}
	
}
