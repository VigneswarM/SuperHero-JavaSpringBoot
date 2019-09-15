package com.example.demo.HeroDao;

import java.util.*;

import javax.persistence.*;

import com.example.demo.MissionDao.Mission;

@Entity
@Access(AccessType.FIELD)
public class SuperHero {
	
	private String Firstname;
	private String LastName;
	@Id
	private String Superheroname;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "Mission_ID")
	private List<Mission> Missions; 

	
	
	public SuperHero(String firstname, String lastName, String superheroname, List<Mission> missions) {
		super();
		Firstname = firstname;
		LastName = lastName;
		Superheroname = superheroname;
		Missions = missions;
	}
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getSuperheroname() {
		return Superheroname;
	}
	public void setSuperheroname(String superheroname) {
		Superheroname = superheroname;
	}
	public List<Mission> getMissions() {
		return Missions;
	}
	public void setMissions(List<Mission> missions) {
		Missions = missions;
	}

}
