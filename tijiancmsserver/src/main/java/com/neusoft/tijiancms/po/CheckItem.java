package com.neusoft.tijiancms.po;

import java.util.List;

public class CheckItem {
	
	private Integer ciId;
	private String ciContent;
	private String ciName;
	private String meaning;
	private String remarks;
	//一对多
	private List<CheckItemDetailed> cdList;
	
	public Integer getCiId() {
		return ciId;
	}
	public List<CheckItemDetailed> getCdList() {
		return cdList;
	}
	public void setCdList(List<CheckItemDetailed> cdList) {
		this.cdList = cdList;
	}
	public void setCiId(Integer ciId) {
		this.ciId = ciId;
	}
	public String getCiContent() {
		return ciContent;
	}
	public void setCiContent(String ciContent) {
		this.ciContent = ciContent;
	}
	public String getCiName() {
		return ciName;
	}
	public void setCiName(String ciName) {
		this.ciName = ciName;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
