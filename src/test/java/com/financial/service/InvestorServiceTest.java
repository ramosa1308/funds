package com.financial.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.financial.entity.Fund;
import com.financial.entity.Holding;
import com.financial.entity.Investor;
import com.financial.exception.FundsException;

public class InvestorServiceTest {
	
	private static Fund fund1;
	private static Investor investor1;
	private static Holding holding1;
	private static InvestorService investorService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		investorService = new InvestorService();
		fund1 = new Fund("TECHNOLOGY ENTERPRISES FUND");
		holding1 = new Holding(110.0, "AAPL");
	}

	@Test
	public void testSetFundToInvestor_addingOneFund_success() {
		investor1 = new Investor("PAUL", "CONSERVATIVE");
		try {
			investorService.setFundToInvestor(investor1, fund1);
		} catch (FundsException e) {
			fail("An error was thrown");
		}
		
		assertTrue(investor1.getFundList().get(0).getName().equals("TECHNOLOGY ENTERPRISES FUND"));
		
	}

	@Test
	public void testSetFundToInvestor_addingTwiceSameFund_error() {
		
		investor1 = new Investor("PAUL", "CONSERVATIVE");
		try {
			investorService.setFundToInvestor(investor1, fund1);
			investorService.setFundToInvestor(investor1, fund1);
		} catch (FundsException e) {
			System.out.println(e.getMessage());
			assertTrue(e.getMessage().equals("Fund TECHNOLOGY ENTERPRISES FUND has already been allocated to the investor PAUL"));
		}
	}

	@Test
	public void testCalculateMK() {
		investor1 = new Investor("PAUL", "CONSERVATIVE");
		try {
			investorService.setFundToInvestor(investor1, fund1);
		} catch (FundsException e) {
			fail("An error was thrown");
		}
		
		Double result = investorService.calculateMK(investor1);
		assertTrue(result.compareTo(0.0) == 0 );
	}

}
