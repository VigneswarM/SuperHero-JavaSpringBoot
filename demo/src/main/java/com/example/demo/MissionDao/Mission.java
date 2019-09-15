package com.example.demo.MissionDao;

import java.util.*;

import javax.persistence.*;

import com.example.demo.HeroDao.SuperHero;

@Entity
@Access(AccessType.FIELD)
public class Mission {

	@Id
	String MissionName;
	Boolean IsCompleted;
	Boolean Isdeleted;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "Heroes_ID")
	List<SuperHero> Heroes;
	
	
	
	public Mission(String missionName, Boolean isCompleted, Boolean isdeleted, List<SuperHero> heroes) {
		super();
		MissionName = missionName;
		IsCompleted = isCompleted;
		Isdeleted = isdeleted;
		Heroes = heroes;
	}
	
	public String getMissionName() {
		return MissionName;
	}
	public void setMissionName(String missionName) {
		MissionName = missionName;
	}
	public Boolean getIsCompleted() {
		return IsCompleted;
	}
	public void setIsCompleted(Boolean isCompleted) {
		IsCompleted = isCompleted;
	}
	public Boolean getIsdeleted() {
		return Isdeleted;
	}
	public void setIsdeleted(Boolean isdeleted) {
		Isdeleted = isdeleted;
	}
	public List<SuperHero> getHeroes() {
		return Heroes;
	}
	public void setHeroes(List<SuperHero> heroes) {
		Heroes = heroes;
	}
	
	
	
}
