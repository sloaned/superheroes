package com.catalyst.superheroes.daos;

import java.util.ArrayList;

import com.catalyst.superheroes.entities.Team;

public interface TeamDao {

	ArrayList<Team> getTeams();
	
	void addTeam(Team team);
	
	void updateTeam(Team team);
	
	void deleteTeam(int id);
}
