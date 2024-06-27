package com.neusoft.tijiancms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.tijiancms.mapper.SetmealMapper;
import com.neusoft.tijiancms.po.Setmeal;
import com.neusoft.tijiancms.service.SetmealService;

@Service
public class SetmealServiceImpl implements SetmealService{
	
	@Autowired
	private SetmealMapper setmealMapper;
	@Override
	public List<Setmeal> listSetmeal(){
		return setmealMapper.listSetmeal();
	}
}
