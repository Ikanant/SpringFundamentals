package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList();
		
		Customer customer = new Customer();
		customer.setFirstName("Jonathan");
		customer.setLastName("Hernandez");
		
		customers.add(customer);
		
		return customers;
	}
}
