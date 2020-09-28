package com.financial.entity;

import java.util.ArrayList;
import java.util.List;

public class Fund {
	private String name;
	private List<Position> positionList = new ArrayList<Position>();

	public Fund(String name) {
		super();
		this.name = name;
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
	 * @return the positionList
	 */
	public List<Position> getPositionList() {
		return positionList;
	}

	/**
	 * @param positionList the positionList to set
	 */
	public void setPositionList(List<Position> positionList) {
		this.positionList = positionList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fund [name=" + name + ", positionList=" + positionList + "]";
	}
	
	
}
