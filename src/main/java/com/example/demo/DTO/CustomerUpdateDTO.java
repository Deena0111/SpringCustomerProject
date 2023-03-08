package com.example.demo.DTO;

public class CustomerUpdateDTO {
	private int customerid;
	private String customerName;
	public CustomerUpdateDTO(int customerid, String customerName) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
	}
	public CustomerUpdateDTO() {
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
		return "CustomerUpdateDTO [customerid=" + customerid + ", customerName=" + customerName + "]";
	}


}
