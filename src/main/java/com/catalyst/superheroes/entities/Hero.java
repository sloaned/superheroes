package com.catalyst.superheroes.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Hero {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

	@Column(nullable=false, unique=true)
	private String heroName;
	
	@Column
	private String realName;
	
	@Column
	private int height;
	
	@Column
	private int weight;
	
	@Column(nullable=false)
	private String origin;
	
	@Column
	private String costume;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(joinColumns = {@JoinColumn(name = "heroId")},
    	inverseJoinColumns = {@JoinColumn(name = "powerId")})
	private Set<Power> powers;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getCostume() {
		return costume;
	}
	public void setCostume(String costume) {
		this.costume = costume;
	}
	public Set<Power> getPowers() {
		return powers;
	}
	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}

	
}
