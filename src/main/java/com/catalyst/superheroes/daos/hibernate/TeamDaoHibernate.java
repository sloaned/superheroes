package com.catalyst.superheroes.daos.hibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.catalyst.superheroes.daos.TeamDao;
import com.catalyst.superheroes.entities.Team;

@Repository
@Transactional
public class TeamDaoHibernate implements TeamDao{

	@PersistenceContext
	private EntityManager em;
	
	public void setEm(EntityManager em){
		this.em = em;
	}
	
	@Override
	public ArrayList<Team> getTeams() {
		return (ArrayList<Team>) em.createQuery("SELECT t FROM Team t", Team.class).getResultList();
	}

	@Override
	public void addTeam(Team team) {
		em.persist(team);
		
	}

	@Override
	public void updateTeam(Team team) {
		em.merge(team);
		
	}

	@Override
	public void deleteTeam(int id) {
		Team team = getTeamById(id);
		em.remove(team);
		
	}
	
	public Team getTeamById(int id){
		return em.createQuery("SELECT t FROM Team t WHERE t.id = :ID", Team.class).setParameter("ID",  id).getSingleResult(); 
	}

}
