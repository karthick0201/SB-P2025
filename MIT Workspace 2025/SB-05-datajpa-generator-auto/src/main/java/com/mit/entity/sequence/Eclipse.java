package com.mit.entity.sequence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="eclipse_sequence_pratice")
public class Eclipse {

	@Id
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "sequence_generator_pratice"
			)
	@SequenceGenerator(
			name = "sequence_generator_pratice",
			sequenceName = "eclipse_seq", // table name
			initialValue = 100,
			allocationSize = 2
			)
	private int id;
	
	private String name;
	
	private String color;
	
	public Eclipse(String name, String color) {
		this.name = name;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Eclipse [id=" + id + ", name=" + name + ", color=" + color + "]";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
