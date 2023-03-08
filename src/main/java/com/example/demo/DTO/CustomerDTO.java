package com.example.demo.DTO;

public class CustomerDTO {
	private int customerid;
	private String customerName;
	public CustomerDTO(int customerid, String customerName) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
	}
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "CustomerDTO [customerid=" + customerid + ", customerName=" + customerName + "]";
	}
	

}
