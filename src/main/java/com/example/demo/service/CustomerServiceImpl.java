package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.CustomerDTO;
import com.example.demo.DTO.CustomerSaveDTO;
import com.example.demo.DTO.CustomerUpdateDTO;
import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public String addCustomer(CustomerSaveDTO customerSaveDTO) {
		Customer customer=new Customer(customerSaveDTO.getCustomerName());
		customerRepo.save(customer);
		return customer.getCustomerName();
	}

	@Override
	public List<CustomerDTO> getAllCustomer() {
		List<Customer>getCustomers=customerRepo.findAll();
		List<CustomerDTO>customerDTOList=new ArrayList<>();
		for(Customer a:getCustomers)
		{
			CustomerDTO customerDTO=new CustomerDTO(
					a.getCustomerid(),
					a.getCustomerName()
					);
			customerDTOList.add(customerDTO);
					
		}
		return customerDTOList;
	}

	@Override
	public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
		if(customerRepo.existsById(customerUpdateDTO.getCustomerid()))
		{
			Customer customer=customerRepo.getById(customerUpdateDTO.getCustomerid());
			customer.setCustomerName(customerUpdateDTO.getCustomerName());
			customerRepo.save(customer);
		}
		else
		{
			System.out.println("Customer Id do not exist");
		}
		return null;
	}

	@Override
	public boolean deleteCustomer(int id) {
	    if(customerRepo.existsById(id))
	    		{
	    	customerRepo.deleteById(id);
	    		}
	    else {
	    	System.out.println("customer id not found");
	    }
		return true;
	}

}
