package com.neusoft.tijiancms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.CheckItemDetailed;

@Mapper
public interface CheckItemDetailedMapper {

	@Select("select * from checkItemDetailed where ciId=#{ciId} order by cdId")
	public List<CheckItemDetailed> listCheckItemDetailed(int CiId);
}
