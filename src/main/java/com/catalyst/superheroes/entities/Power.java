package com.catalyst.superheroes.entities;

import javax.persistence.*;

@Entity
public class Power {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
	
	@Column(nullable=false)
	private String power;

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
