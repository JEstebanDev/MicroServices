package com.jestebandev.customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {

}
