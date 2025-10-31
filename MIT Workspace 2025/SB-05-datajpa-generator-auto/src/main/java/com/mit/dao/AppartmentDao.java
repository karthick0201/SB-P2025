package com.mit.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.mit.entity.customgenerator.Appartment;

public interface AppartmentDao extends ListCrudRepository<Appartment, String> {

}
