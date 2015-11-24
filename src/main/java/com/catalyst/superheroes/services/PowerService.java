package com.catalyst.superheroes.services;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Power;

public interface PowerService {

	ArrayList<Power> getPowers();
	
	void addPower(Power power);
	
	void updatePower(Power power);
	
	void deletePower(int id);
}
