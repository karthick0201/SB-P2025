package com.mit.entity;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table
@Entity(name="mit_enquires")
public class Enquiry {

	@Id
	@Column(name="enquiry_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer enquiryId;
	
	@Column(name="enquiry_name")
	private String name;

	@Column(name="contact_no")
	private String contactNo;

	@Column(name="email")
	private String emailId;

	@Column(name="course")
	private String courseName;
	
	@Column(name="created_dt")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	public Enquiry() {

	}
	
	public Enquiry(Integer enquiryId, String name, String contactNo, String emailId, String courseName) {
		super();
		this.enquiryId = enquiryId;
		this.name = name;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.courseName = courseName;
	}

	public Enquiry(String name, String contactNo, String emailId, String courseName) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.courseName = courseName;
	}

	public void setEnquiryId(Integer enquiryId) {
		this.enquiryId = enquiryId;
	}
	
	public Integer getEnquiryId() {
		return enquiryId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}

	@Override
	public String toString() {
		return "Enquiry [enquiryId=" + enquiryId + ", name=" + name + ", contactNo=" + contactNo + ", emailId="
				+ emailId + ", courseName=" + courseName + "]";
	}
}
