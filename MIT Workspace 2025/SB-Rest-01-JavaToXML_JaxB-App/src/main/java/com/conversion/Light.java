package com.conversion;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonRootName(value = "light")
public class Light {

	@JsonProperty
	private int id;
	
	@JsonProperty
	private String name;
	
	@JsonProperty
	private int energyWatt;

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

	public int getEnergyWatt() {
		return energyWatt;
	}

	public void setEnergyWatt(int energyWatt) {
		this.energyWatt = energyWatt;
	}

	@Override
	public String toString() {
		return "Light [id=" + id + ", name=" + name + ", energyWatt=" + energyWatt + "]";
	}
	
	
}
