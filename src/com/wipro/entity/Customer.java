package com.wipro.entity;

public class Customer {
	private String cusId;


	private String cusName;
	private String cusAddress;
	private String cusgender;
	private String cusMobile;
	public Customer(String cusId, String cusName, String cusAddress, String cusgender, String cusMobile) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAddress = cusAddress;
		this.cusgender = cusgender;
		this.cusMobile = cusMobile;
	}
	public Customer() {
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusId() {
		return cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusAddress() {
		return cusAddress;
	}

	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}

	public String getCusgender() {
		return cusgender;
	}

	public void setCusgender(String cusgender) {
		this.cusgender = cusgender;
	}

	public String getCusMobile() {
		return cusMobile;
	}

	public void setCusMobile(String cusMobile) {
		this.cusMobile = cusMobile;
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", cusName=" + cusName + ", cusAddress=" + cusAddress + ", cusgender="
				+ cusgender + ", cusMobile=" + cusMobile + "]";
	}
}
