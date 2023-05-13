package com.HamzaService.student.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(nullable=false, updatable=false)
	private Long id;
	private String name;
	private String email;
	private String speciality;
	private String phone;
	private String imageUrl;
	@Column(nullable=false, updatable=false)
	private String studentCode;
	
	public Student() {}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}


	@Override
	public String toString() {
		return "Student{" + 
				"id=" + id +
				", name='" + name + '\'' +
                ", email='" + email + '\'' +
				", speciality='" + speciality + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
				"}";
	}
	
	
	
	
	
	
	

}
