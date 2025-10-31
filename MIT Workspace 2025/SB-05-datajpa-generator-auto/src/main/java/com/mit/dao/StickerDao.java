package com.mit.dao;

import org.springframework.data.repository.ListCrudRepository;

import com.mit.entity.Sticker;

public interface StickerDao extends ListCrudRepository<Sticker,Integer> {
	
	

}
