package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entity.Customer;

@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	

}
