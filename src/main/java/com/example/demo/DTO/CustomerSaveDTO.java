package com.example.demo.DTO;

public class CustomerSaveDTO {
	
	private String customerName;
	public CustomerSaveDTO(String customerName) {
		super();
		
		this.customerName = customerName;
	}
	public CustomerSaveDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "CustomerSaveDTO [customerName=" + customerName + "]";
	}

}
