package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@Column(name="customer_id",length=50)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	@Column(name="customer_name",length=50)
	private String customerName;
	public Customer(int customerid, String customerName) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
	}
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	public Customer() {
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
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + "]";
	}
	

}
