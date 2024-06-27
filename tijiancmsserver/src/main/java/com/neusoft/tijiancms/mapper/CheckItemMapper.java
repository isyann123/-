package com.neusoft.tijiancms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.CheckItem;

@Mapper
public interface CheckItemMapper {
	
	@Select("select * from checkItem where ciId=#{ciId}")
	public CheckItem getCheckItemById(Integer ciId);
}
