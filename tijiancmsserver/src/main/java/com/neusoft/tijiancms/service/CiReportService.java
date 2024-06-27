package com.neusoft.tijiancms.service;

import java.util.List;

import com.neusoft.tijiancms.po.CiReport;
import com.neusoft.tijiancms.po.Orders;

public interface CiReportService {

	public int createReportTemplate(Orders orders);
	
	public List<CiReport> listCiReport(Integer orderId);
}
