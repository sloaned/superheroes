package com.catalyst.superheroes.daos;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Power;

public interface PowerDao {

	ArrayList<Power> getPowers();
	
	void addPower(Power power);
	
	void updatePower(Power power);
	
	void deletePower(int id);
}
