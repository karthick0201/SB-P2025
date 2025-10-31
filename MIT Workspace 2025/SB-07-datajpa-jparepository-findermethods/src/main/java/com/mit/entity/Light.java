package com.mit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "light_table")
public class Light {
	
	@Id
	@GeneratedValue// by default - auto - light_table_seq
	private int id;
	private String name;
	private String type;
	
	public Light() {
	}
	public Light(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Light [id=" + id + ", name=" + name + ", type=" + type + "]";
	}

	
			
			
}
