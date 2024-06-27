package com.neusoft.tijiancms.po;

public class Orders {
	private Integer orderId;
	private String oderDate;
	private String userId;
	private Integer smId;
	private Integer state;
	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	private Setmeal setmeal;
	private Hospital hospital;
	private Users users;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOderDate() {
		return oderDate;
	}

	public void setOderDate(String oderDate) {
		this.oderDate = oderDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getSmId() {
		return smId;
	}

	public void setSmId(Integer smId) {
		this.smId = smId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Setmeal getSetmeal() {
		return setmeal;
	}

	public void setSetmeal(Setmeal setmeal) {
		this.setmeal = setmeal;
	}
	
}
