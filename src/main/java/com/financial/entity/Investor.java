package com.financial.entity;

import java.util.ArrayList;
import java.util.List;

public class Investor {
	private String name;
	private String profile;
	private List<Fund> fundList = new ArrayList<Fund>();
	
	public Investor(String name, String profile) {
		super();
		this.name = name;
		this.profile = profile;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the profile
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @return the fundList
	 */
	public List<Fund> getFundList() {
		return fundList;
	}

	/**
	 * @param fundList the fundList to set
	 */
	public void setFundList(List<Fund> fundList) {
		this.fundList = fundList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Investor [name=" + name + ", profile=" + profile + ", fundList=" + fundList.toString() + "]";
	}
	
	
	
}
