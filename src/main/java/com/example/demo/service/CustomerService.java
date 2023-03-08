package com.example.demo.service;


import java.util.List;

import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerSaveDTO;
import com.example.demo.DTO.CustomerUpdateDTO;

public interface CustomerService {

	String addCustomer(CustomerSaveDTO customerSaveDTO);

	List<CustomerDTO> getAllCustomer();

	String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

	boolean deleteCustomer(int id);

}
