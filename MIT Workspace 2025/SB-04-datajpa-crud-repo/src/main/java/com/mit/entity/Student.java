package com.mit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "student_rollno")
	private int rollNo;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name = "student_phoneno")
	private String phoneNo;
	
	@Column(name = "student_location")
	private String location;

	public Student(int rollNo, String name, String phoneNo, String location) {
		this.rollNo = rollNo;
		this.name = name;
		this.phoneNo = phoneNo;
		this.location = location;
	}
	
	public Student() {
		//System.out.println(">>----| Studnet Default Constructor Called!!!");
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", phoneNo=" + phoneNo + ", location=" + location + "]";
	}
	
	
	
	
}
