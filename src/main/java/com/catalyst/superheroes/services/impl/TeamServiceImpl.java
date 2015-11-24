package com.catalyst.superheroes.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.superheroes.daos.TeamDao;
import com.catalyst.superheroes.entities.Team;
import com.catalyst.superheroes.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	@Autowired
	public TeamDao teamDao;
	
	public void setTeamDao(TeamDao teamDao){
		this.teamDao = teamDao;
	}
	
	@Override
	public ArrayList<Team> getTeams() {
		return teamDao.getTeams();
	}

	@Override
	public void addTeam(Team team) {
		teamDao.addTeam(team);	
	}

	@Override
	public void updateTeam(Team team) {
		teamDao.updateTeam(team);
		
	}

	@Override
	public void deleteTeam(int id) {
		teamDao.deleteTeam(id);
		
	}

}
