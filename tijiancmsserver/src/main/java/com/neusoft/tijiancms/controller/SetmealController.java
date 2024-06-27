package com.neusoft.tijiancms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.tijiancms.po.Setmeal;
import com.neusoft.tijiancms.service.SetmealService;

@RestController
@RequestMapping("/setmeal")
public class SetmealController {
	
	@Autowired
	private SetmealService setmealService;
	
	@RequestMapping("/listSetmeal")
	public List<Setmeal> listSetmeal(){
		return setmealService.listSetmeal();
	}
}
