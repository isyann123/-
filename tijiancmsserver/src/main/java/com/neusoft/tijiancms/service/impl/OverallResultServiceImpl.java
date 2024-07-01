package com.neusoft.tijiancms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijiancms.mapper.OverallResultMapper;
import com.neusoft.tijiancms.po.OverallResult;
import com.neusoft.tijiancms.service.OverallResultService;

@Service
public class OverallResultServiceImpl implements OverallResultService {

	@Autowired
	private OverallResultMapper overallResultMapper;

	@Override
	public List<OverallResult> listOverallResultByOrderId(Integer orderId) {
		// TODO Auto-generated method stub
		return overallResultMapper.listOverallResultByOrderId(orderId);
	}

	@Override
	public int saveOverallResult(OverallResult overallResult) {
		// TODO Auto-generated method stub
		return overallResultMapper.saveOverallResult(overallResult);
	}

	@Override
	public int updateOverallResult(OverallResult overallResult) {
		// TODO Auto-generated method stub
		return overallResultMapper.updateOverallResult(overallResult);
	}

	@Override
	public int removeOverallResult(Integer orId) {
		// TODO Auto-generated method stub
		return overallResultMapper.removeOverallResult(orId);
	}
}
