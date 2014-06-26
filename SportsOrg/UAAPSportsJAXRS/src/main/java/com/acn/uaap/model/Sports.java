package com.acn.uaap.model;

import java.util.List;

public class Sports {
	private Integer id;
	private String sportsName;
	private List<League> leagues;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public List<League> getLeagues() {
		return leagues;
	}
	public void setLeagues(List<League> leagues) {
		this.leagues = leagues;
	}
}
