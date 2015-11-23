package com.catalyst.superheroes.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superheroes.entities.Hero;
import com.catalyst.superheroes.services.HeroService;

@RestController
public class HeroController {

	@Autowired
	public HeroService heroService;
	
	public void setHeroService(HeroService heroService){
		this.heroService = heroService;
	}
	
	@RequestMapping(value="/hero", method=RequestMethod.GET)
	public ArrayList<Hero> getHeroes(){
		return heroService.getHeroes();	
	}
	
	@RequestMapping(value="/hero", method=RequestMethod.POST)
	public void addHero(@RequestBody Hero hero){
		heroService.addHero(hero);
	}
	
	@RequestMapping(value="/hero/{id}", method=RequestMethod.PUT)
	public void updateHero(@PathVariable Integer id, @RequestBody Hero hero){
		hero.setId(id);
		heroService.updateHero(hero);
	}
	
	@RequestMapping(value="/hero/{id}", method=RequestMethod.DELETE)
	public void deleteHero(@PathVariable Integer id){
		heroService.deleteHero(id);
	}
	
}
