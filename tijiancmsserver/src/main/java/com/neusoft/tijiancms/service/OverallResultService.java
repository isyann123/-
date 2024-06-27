package com.neusoft.tijiancms.service;

import java.util.List;


import com.neusoft.tijiancms.po.OverallResult;

public interface OverallResultService {

	public List<OverallResult> listOverallResultByOrderId(Integer orderId);

	public int saveOverallResult(OverallResult overallResult);
	
	public int upadteOverallResult(OverallResult overallResult);
	
	public int removeOverallResult(Integer orId);
	
}
