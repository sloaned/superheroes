package com.catalyst.superheroes.entities;

import javax.persistence.*;

@Entity
public class Power {
	
	private String power;

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

}
