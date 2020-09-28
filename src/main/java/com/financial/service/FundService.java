package com.financial.service;

import java.util.List;

import com.financial.entity.Fund;
import com.financial.entity.Holding;
import com.financial.entity.Position;

public class FundService {

	public void setPositionToFund(Fund fund, Holding holding, Integer position) {
		List<Position> positionList = fund.getPositionList();
		System.out.println("ADDING: " + position + " HOLDINGS FROM " + holding.getTicker() + " TO FUND " + fund.getName());
		Boolean found = false;
		
		for(Position pos: positionList) {
			if(holding.getTicker().equals(pos.getHolding().getTicker())){
				pos.setHoldingNumber(pos.getHoldingNumber() + position);
				System.out.println("\tPOSITION ALREADY EXIST... ADDING " + position + " HOLDINGS FROM " + holding.getTicker());
				found =true;
			}
		}
		if(!found) {
			Position pos = new Position(holding, position);
			fund.getPositionList().add(pos);
			System.out.println("\tNEW POSITION ADDED " + position + " HOLDINGS FROM " + holding.getTicker());
		}
		
		
		
		
	}

	public Double calculateMK(Fund fund) {
		Double markCap = 0.0;
		List<Position> positionList = fund.getPositionList();
		for(Position position: positionList) {
			markCap = markCap + (position.getHolding().getPrice() * position.getHoldingNumber());
		}
		
		return markCap;
	}

}
