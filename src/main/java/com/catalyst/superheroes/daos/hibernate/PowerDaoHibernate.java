package com.catalyst.superheroes.daos.hibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superheroes.daos.PowerDao;
import com.catalyst.superheroes.entities.Power;

@Repository
@Transactional
public class PowerDaoHibernate implements PowerDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em){
		this.em = em;
	}

	@Override
	public ArrayList<Power> getPowers() {
		return (ArrayList<Power>) em.createQuery("SELECT p FROM Power p", Power.class).getResultList();
	}

	@Override
	public void addPower(Power power) {
		em.persist(power);
		
	}

	@Override
	public void updatePower(Power power) {
		em.merge(power);
	}

	@Override
	public void deletePower(int id) {
		Power power = getPowerById(id);
		em.remove(power);
		
	}
	
	public Power getPowerById(int id){
		return em.createQuery("SELECT p FROM Power p WHERE p.id = :ID", Power.class).setParameter("ID", id).getSingleResult();
	}
	
	

}
