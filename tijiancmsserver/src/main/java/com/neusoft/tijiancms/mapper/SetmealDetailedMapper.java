package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.tijiancms.po.SetmealDetailed;

@Mapper
public interface SetmealDetailedMapper {

	public List<SetmealDetailed> listSetmealDetailedBySmId(Integer smId);
}
