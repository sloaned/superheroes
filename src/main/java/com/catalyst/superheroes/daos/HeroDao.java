package com.catalyst.superheroes.daos;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Hero;

public interface HeroDao {
	
	ArrayList<Hero> getHeroes();
	
	void addHero(Hero hero);
	
	void updateHero(Hero hero);
	
	void deleteHero(int id);

}
