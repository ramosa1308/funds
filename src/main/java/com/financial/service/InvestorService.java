package com.financial.service;

import java.util.List;

import com.financial.entity.Fund;
import com.financial.entity.Investor;
import com.financial.exception.FundsException;
import com.financial.exception.FundsExceptionAttributes;

public class InvestorService {
	
	private FundService fundService;

	
	public InvestorService() {
		fundService = new FundService();
	}

	public void setFundToInvestor(Investor investor,Fund fund) throws FundsException{
		List<Fund> fundList = investor.getFundList();
		System.out.println("ADDING " + fund.getName() + " TO INVESTOR " + investor.getName());
		if(!fundList.isEmpty()) {
			for(Fund funds: fundList) {
				if(fund.getName().equals(funds.getName())) {
					throw new FundsException("Fund " + fund.getName() + " has already been allocated to the investor " + investor.getName() , 
							new FundsExceptionAttributes("InvestorService", "setFundToInvestor"));
				}
			}
		}
		fundList.add(fund);
		System.out.println("\tFUND " + fund.getName() + " HAS BEEN ALLOCATED TO THE INVESTOR " + investor.getName());
	}

	public Double calculateMK(Investor investor1) {
		Double marketCap = 0.0;
		List<Fund> fundList = investor1.getFundList();
		
		for(Fund fund:fundList) {
			marketCap = marketCap + fundService.calculateMK(fund);
		}
		
		return marketCap;
	}
}
