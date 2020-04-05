package community.foundation.bank.Community_bank.entity;

public class Customer {
	
	private int cust_id;
	private String cust_name;
	private String cust_place;
	
	public Customer() {
		
	}
	
	public Customer(int cust_id, String cust_name, String cust_place) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_place = cust_place;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_place() {
		return cust_place;
	}
	public void setCust_place(String cust_place) {
		this.cust_place = cust_place;
	}
	
}
