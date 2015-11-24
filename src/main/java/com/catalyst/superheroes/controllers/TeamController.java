package com.catalyst.superheroes.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.catalyst.superheroes.entities.Team;
import com.catalyst.superheroes.services.TeamService;

@RestController
public class TeamController {

	@Autowired
	public TeamService teamService;
	
	public void setTeamService(TeamService teamService){
		this.teamService = teamService;
	}
	
	@RequestMapping(value="/team", method=RequestMethod.GET)
	public ArrayList<Team> getTeams(){
		return teamService.getTeams();
	}
	
	@RequestMapping(value="/team", method=RequestMethod.POST)
	public void addTeam(@RequestBody Team team){
		teamService.addTeam(team);
	}
	
	@RequestMapping(value="/team/{id}", method=RequestMethod.PUT)
	public void updateTeam(@PathVariable Integer id, @RequestBody Team team){
		team.setId(id);
		teamService.updateTeam(team);
	}
	
	@RequestMapping(value="/team/{id}", method=RequestMethod.GET)
	public void deleteTeam(@PathVariable Integer id){
		teamService.deleteTeam(id);
	}
}
