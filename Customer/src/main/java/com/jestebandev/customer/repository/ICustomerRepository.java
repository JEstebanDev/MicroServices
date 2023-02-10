package com.jestebandev.customer.repository;

import com.jestebandev.customer.data.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
