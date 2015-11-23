package com.catalyst.superheroes.services;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Hero;

public interface HeroService {

	ArrayList<Hero> getHeroes();
	
	void addHero(Hero hero);
	
	void updateHero(Hero hero);
	
	void deleteHero(int id);
}
