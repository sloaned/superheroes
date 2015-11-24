package com.catalyst.superheroes.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superheroes.daos.PowerDao;
import com.catalyst.superheroes.entities.Power;
import com.catalyst.superheroes.services.PowerService;

@Service
public class PowerServiceImpl implements PowerService{

	@Autowired
	public PowerDao powerDao;
	
	public void setPowerDao(PowerDao powerDao){
		this.powerDao = powerDao;
	}
	
	@Override
	public ArrayList<Power> getPowers() {
		return powerDao.getPowers();
	}

	@Override
	public void addPower(Power power) {
		powerDao.addPower(power);
		
	}

	@Override
	public void updatePower(Power power) {
		powerDao.updatePower(power);
		
	}

	@Override
	public void deletePower(int id) {
		powerDao.deletePower(id);
		
	}

}
