package admin.adminservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class admin {
	
	@Id
	int aid;
	String a_username;
	String a_password;
	
	public admin() {
		
	}

	public admin(int aid, String a_username, String a_password) {
		super();
		this.aid = aid;
		this.a_username = a_username;
		this.a_password = a_password;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getA_username() {
		return a_username;
	}

	public void setA_username(String a_username) {
		this.a_username = a_username;
	}

	public String getA_password() {
		return a_password;
	}

	public void setA_password(String a_password) {
		this.a_password = a_password;
	}

}