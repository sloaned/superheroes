package com.catalyst.superheroes.services;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Team;

public interface TeamService {

	ArrayList<Team> getTeams();
	
	void addTeam(Team team);
	
	void updateTeam(Team team);
	
	void deleteTeam(int id);
}
