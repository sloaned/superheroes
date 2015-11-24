package com.catalyst.superheroes.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superheroes.entities.Power;
import com.catalyst.superheroes.services.PowerService;

@RestController
public class PowerController {
	
	@Autowired
	public PowerService powerService;
	
	public void setPowerService(PowerService powerService){
		this.powerService = powerService;
	}
	
	@RequestMapping(value="/power", method=RequestMethod.GET)
	public ArrayList<Power> getPowers(){
		return powerService.getPowers();
	}
	
	@RequestMapping(value="/power", method=RequestMethod.POST)
	public void addPower(@RequestBody Power power){
		powerService.addPower(power);
	}
	
	@RequestMapping(value="/power/{id}", method=RequestMethod.PUT)
	public void updatePower(@PathVariable Integer id, @RequestBody Power power){
		power.setId(id);
		powerService.updatePower(power);
	}
	
	@RequestMapping(value="/power/{id}", method=RequestMethod.DELETE)
	public void deletePower(@PathVariable Integer id){
		powerService.deletePower(id);
	}
	

}
