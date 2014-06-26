package com.acn.uaap.model;

import java.util.List;

public class School {
	private Integer id;
	private String schoolName;
	private List<Sports> sports;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public List<Sports> getSports() {
		return sports;
	}
	public void setSports(List<Sports> sports) {
		this.sports = sports;
	}
}
