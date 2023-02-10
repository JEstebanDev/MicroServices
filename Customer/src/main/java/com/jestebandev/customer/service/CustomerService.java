package com.jestebandev.customer.service;

import com.jestebandev.customer.data.Customer;
import com.jestebandev.customer.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

@Service
public record CustomerService(ICustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer=Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        customerRepository.save(customer);
    }
}
