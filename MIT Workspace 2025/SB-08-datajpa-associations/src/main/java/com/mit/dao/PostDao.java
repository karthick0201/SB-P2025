package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer>{

}
