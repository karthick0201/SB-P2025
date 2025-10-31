package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Enquiry;

public interface EnquiryDao extends JpaRepository<Enquiry, Integer> {

}
