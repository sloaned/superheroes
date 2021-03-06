package com.catalyst.superheroes.daos.hibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superheroes.daos.HeroDao;
import com.catalyst.superheroes.entities.Hero;
import com.catalyst.superheroes.entities.Power;

@Repository
@Transactional
public class HeroDaoHibernate implements HeroDao{

	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public ArrayList<Hero> getHeroes() {
		return (ArrayList<Hero>) em.createQuery("SELECT h FROM Hero h ORDER BY h.id", Hero.class).getResultList();
	}

	@Override
	public void addHero(Hero hero) {
		for (Power p : hero.getPowers())
            try {
                if (p.getPower() != null) {
                    Integer id = em.createQuery("SELECT p.id FROM Power p WHERE p.power = :power", Integer.class).setParameter("power", p.getPower()).getSingleResult();
                    p.setId(id);
                }
            } catch (NoResultException e) {
                em.persist(p);
        }
		em.merge(hero);
		
	}

	@Override
	public void updateHero(Hero hero) {
		for (Power p : hero.getPowers())
            try {
                if (p.getPower() != null) {
                    Integer id = em.createQuery("SELECT p.id FROM Power p WHERE p.power = :power", Integer.class).setParameter("power", p.getPower()).getSingleResult();
                    p.setId(id);
                }
            } catch (NoResultException e) {
                em.persist(p);
        }
		em.merge(hero);
		
	}

	@Override
	public void deleteHero(int id) {
		Hero hero = getHeroById(id);
		em.remove(hero);
	}
	
	public Hero getHeroById(int id){
		return em.createQuery("SELECT h FROM Hero h WHERE h.id = :ID", Hero.class).setParameter("ID", id).getSingleResult();
	}

}
