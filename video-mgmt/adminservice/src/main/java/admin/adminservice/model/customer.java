package admin.adminservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class customer {
	
	@Id
	int customer_id;
	String customer_name;
	int contact_no;
	String contact_address;
	int age;
	
	
	
	
	
	public customer() {
		
	}
	
    
	


	





	public customer(int customer_id, String customer_name, int contact_no, String contact_address,
			 int age) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.contact_no = contact_no;
		this.contact_address = contact_address;
		
		this.age = age;
		
	}











	public int getCustomer_id() {
		return customer_id;
	}











	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}











	public String getCustomer_name() {
		return customer_name;
	}











	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}











	public int getContact_no() {
		return contact_no;
	}











	public void setContact_no(int contact_no) {
		this.contact_no = contact_no;
	}











	public String getContact_address() {
		return contact_address;
	}











	public void setContact_address(String contact_address) {
		this.contact_address = contact_address;
	}











	











	public int getAge() {
		return age;
	}











	public void setAge(int age) {
		this.age = age;
	}











	

}









	