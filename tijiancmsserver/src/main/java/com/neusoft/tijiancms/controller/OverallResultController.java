package com.neusoft.tijiancms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijiancms.po.OverallResult;
import com.neusoft.tijiancms.service.OverallResultService;

@RestController
@RequestMapping("/overallResult")
public class OverallResultController {

	@Autowired
	private OverallResultService overallResultService;
	
	@RequestMapping("/listOverallResultByOrderId")
	public List<OverallResult> listOverallResultByOrderId(@RequestBody OverallResult overallResult){
		return overallResultService.listOverallResultByOrderId(overallResult.getOrderId());
	}
	
	@RequestMapping("/saveOverallResult")
	public int saveOverallResult(@RequestBody OverallResult overallResult) {
		// TODO Auto-generated method stub
		return overallResultService.saveOverallResult(overallResult);
	}

	@RequestMapping("/upadteOverallResult")
	public int upadteOverallResult(@RequestBody OverallResult overallResult) {
		// TODO Auto-generated method stub
		return overallResultService.upadteOverallResult(overallResult);
	}

	@RequestMapping("/deletetOverallResult")
	public int deletetOverallResult(@RequestBody OverallResult overallResult) {
		// TODO Auto-generated method stub 
		return overallResultService.removeOverallResult(overallResult.getOrId());
	}
}
