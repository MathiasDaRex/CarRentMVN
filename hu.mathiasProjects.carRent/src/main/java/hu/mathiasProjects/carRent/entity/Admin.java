package hu.mathiasProjects.carRent.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;
	private String username;
	private String hashPwd;
	private String name;
	private String email;
	private String tel;
	
	public Admin(Integer adminId, String username, String hashPwd, String name, String email, String tel) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.hashPwd = hashPwd;
		this.name = name;
		this.email = email;
		this.tel = tel;
	}

	public Admin() {
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getHashPwd() {
		return hashPwd;
	}

	public void setHashPwd(String hashPwd) {
		this.hashPwd = hashPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
	
	

}
