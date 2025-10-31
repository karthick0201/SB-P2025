package com.mit.entity.table;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;

@Entity
@Table(name = "monitor")
public class Monitor {
	
	@Id
	@GeneratedValue(
		strategy = GenerationType.TABLE,
		generator = "table_generator"
	)
	@TableGenerator(
		name = "table_generator",
		allocationSize = 5,
		initialValue = 190,
		table = "sequence_store",
		pkColumnName = "seq_name",          // Column that holds key name (e.g. 'monitor_seq')
		valueColumnName = "seq_value",      // Column that holds numeric value
		pkColumnValue = "monitor_seq"     // The key for this entity’s sequence
	)
	private int id;
	
	private String brand;
	
	public Monitor() {
	}
	public Monitor(String brand) {
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Monitor [id=" + id + ", brand=" + brand + "]";
	}
	
	

}
