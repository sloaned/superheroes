package com.catalyst.superheroes.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.catalyst.superheroes.entities.Hero;
import com.catalyst.superheroes.services.HeroService;

public class HeroServiceImpl implements HeroService{
	
	@Autowired
	public HeroDao heroDao;
	
	public void setHeroDao(HeroDao heroDao){
		this.heroDao = heroDao;
	}

	@Override
	public ArrayList<Hero> getHeroes() {
		return heroDao.getHeroes();
	}

	@Override
	public void addHero(Hero hero) {
		heroDao.addHero(hero);
		
	}

	@Override
	public void updateHero(Hero hero) {
		heroDao.updateHero(hero);
		
	}

	@Override
	public void deleteHero(int id) {
		heroDao.deleteHero(id);
		
	}

}
