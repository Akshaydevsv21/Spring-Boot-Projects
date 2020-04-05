package community.foundation.bank.Community_bank.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import community.foundation.bank.Community_bank.entity.Customer;
@Service
public class CustomerService {

	private List<Customer> customers=new ArrayList<>(Arrays.asList(new Customer(01,"Akshay","Kayamkulam"),
												   new Customer(02,"Akhil","Alappuzha"),
												   new Customer(03,"Nolan","America"),
												   new Customer(04,"Amal","TVM")));
	
	public List<Customer> getAllCustomer(){
		return customers;
	}
	
	public Customer getCustomer(int id) {
		return customers.stream().filter(t -> t.getCust_id()==id).findFirst().get();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void putCustomer(int id, Customer customer) {
		for(int i=0;i<customers.size();i++) {
			Customer c=customers.get(i);
			if(c.getCust_id()==id) {
				customers.set(i,customer);
				return;
			}
		}
		
	}

	public void deleteCustomer(int id) {
		customers.removeIf(t -> t.getCust_id()==id);  //Use of lambda expression
		
	}

	
}
