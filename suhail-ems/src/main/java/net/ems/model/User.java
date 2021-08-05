package net.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

	import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name = "firstname")
	private String fistname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "aadhar_number")
	private String aadharNo;
	
	@Column(name = "gender")
	private char gender;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "pincode")
	private String pincode;
	
	@Column(name = "password")
	private String password;
	
	public User() {
		
	}
	public User(String fistname, String lastname, String aadharNo, char gender, int age, String mobileNumber,
			String email, String city, String state, String pincode, String password, String securityQuestion,
			String securityAnswer) {
		super();
		this.fistname = fistname;
		this.lastname = lastname;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	@Column(name = "security_ques")
	private String securityQuestion;
	
	@Column(name = "security_ans")
	private String securityAnswer;
}
