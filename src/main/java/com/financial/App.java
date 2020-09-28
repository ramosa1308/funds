package com.financial;

import java.util.ArrayList;
import java.util.List;

import com.financial.entity.Fund;
import com.financial.entity.Holding;
import com.financial.entity.Investor;
import com.financial.exception.FundsException;
import com.financial.service.FundService;
import com.financial.service.InvestorService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        Investor investor1 = new Investor("PAUL", "CONSERVATIVE");
        Fund fund1 = new Fund("TECHNOLOGY ENTERPRISES FUND");
        Holding holding1 = new Holding(110.0, "AAPL");
        
        
        System.out.println("ADDING FUND TO INVESTOR");
        InvestorService investorService = new InvestorService();
		try {
			investorService.setFundToInvestor(investor1, fund1);
			investorService.setFundToInvestor(investor1, fund1);
		} catch (FundsException e) {
			System.out.println("!!!!!!!ERROR: " + e.getMessage());
		}
		
        
        System.out.println(investor1);
        System.out.println("\n\nADDING POSITION TO FUND");
        FundService fundService = new FundService();
        fundService.setPositionToFund(fund1,holding1,100);
        fundService.setPositionToFund(fund1,holding1,50);
       
        System.out.println(investor1);
        
       System.out.println("Market Cap fund " + fund1.getName() +": " + fundService.calculateMK(fund1));
       
       Holding holding2 = new Holding(1420.0, "GOOG");
       fundService.setPositionToFund(fund1,holding2,20);
       
       System.out.println("Market Cap fund " + fund1.getName() +": " + fundService.calculateMK(fund1));
       
       Fund fund2 = new Fund("ENERGY ENTERPRISES FUND");
       Holding holding3 = new Holding(35.0, "XOM");
       
       System.out.println("\n\nADDING FUND TO INVESTOR");
       try {
			investorService.setFundToInvestor(investor1, fund2);
		} catch (FundsException e) {
			System.out.println("!!!!!!!ERROR: " + e.getMessage());
		}
       
       System.out.println(investor1);
       System.out.println("\n\nADDING POSITION TO FUND");
       fundService.setPositionToFund(fund2,holding3,500);
       System.out.println(investor1);
       System.out.println("Market Cap fund " + fund1.getName() +": " + fundService.calculateMK(fund1));
       System.out.println("Market Cap fund " + fund2.getName() +": " + fundService.calculateMK(fund2));
       
       System.out.println("Market Cap Investor " + investor1.getName() +": " + investorService.calculateMK(investor1));
            
    }
}
