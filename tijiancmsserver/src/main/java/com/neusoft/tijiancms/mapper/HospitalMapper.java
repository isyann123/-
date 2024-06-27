package com.neusoft.tijiancms.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.tijiancms.po.Hospital;

@Mapper
public interface HospitalMapper {
	
	@Select("select * from hospital where hpId=#{hpId}")
	public Hospital getHospitalById(Integer hpId);
}
