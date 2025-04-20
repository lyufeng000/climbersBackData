package com.lyufeng.pojo;

public class Member {
	private Integer id;
	private String name;
	private String gender;
	private String category;
	private String office;
	private String email;
	private String phone;
	private String hobby;
	private Boolean status;
	
	
	public Member() {
	}
	
	public Member(Integer id, String name, String gender, String category, String office, String email, String phone, String hobby, Boolean status) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.category = category;
		this.office = office;
		this.email = email;
		this.phone = phone;
		this.hobby = hobby;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public String getOffice() {
		return office;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public String toString() {
		return "Member{id = " + id + ", name = " + name + ", gender = " + gender + ", category = " + category + ", office = " + office + ", email = " + email + ", phone = " + phone + ", hobby = " + hobby + ", status = " + status + "}";
	}
}
