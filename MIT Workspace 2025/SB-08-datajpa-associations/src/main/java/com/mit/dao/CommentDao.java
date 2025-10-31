package com.mit.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mit.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer>{
	
	

}
