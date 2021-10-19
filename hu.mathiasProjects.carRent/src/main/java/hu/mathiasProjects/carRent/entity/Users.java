package hu.mathiasProjects.carRent.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String username;
	private String hashPwd;
	private String fullName;
	private String email;
	private String tel;
	private Date birthDate;
	private String gender;
	

	public Users(Long userId, String username, String hashPwd, String fullName, String email, String tel,
			Date birthDate, String gender) {
		super();
		this.userId = userId;
		this.username = username;
		this.hashPwd = hashPwd;
		this.fullName = fullName;
		this.email = email;
		this.tel = tel;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public Users() {
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Ügyfél azonosítója: " + userId + ", Neve=" + fullName + ", Születési dátuma=" + birthDate ;
	}
	
	
	
	
	
	
}
