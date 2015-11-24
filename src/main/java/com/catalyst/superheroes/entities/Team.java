package com.catalyst.superheroes.entities;

import java.util.Set;

import javax.persistence.*;
@Entity
public class Team {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
	private Integer id;
	
	@Column(nullable=false, unique=true)
	private String name;
	@Column
	private String headquarters;
	@Column
	private String supportLevel;
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(joinColumns = {@JoinColumn(name = "teamId")},
    	inverseJoinColumns = {@JoinColumn(name = "heroId")})
	private Set<Hero> members;
	@Column
	private String leader;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public String getSupportLevel() {
		return supportLevel;
	}
	public void setSupportLevel(String supportLevel) {
		this.supportLevel = supportLevel;
	}
	public Set<Hero> getMembers() {
		return members;
	}
	public void setMembers(Set<Hero> members) {
		this.members = members;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	
	
	
}
