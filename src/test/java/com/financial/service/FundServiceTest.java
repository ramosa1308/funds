package com.financial.service;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.financial.entity.Fund;
import com.financial.entity.Holding;

public class FundServiceTest {
	
	private static Fund fund1;
	private static Holding holding1;
	private static FundService fundService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		fundService = new FundService();
        holding1 = new Holding(110.0, "AAPL");
	}

	@Test
	public void testSetPositionToFund_addingOnePosition_success() {
		fund1 = new Fund("TECHNOLOGY ENTERPRISES FUND");
		fundService.setPositionToFund(fund1, holding1, 50);
		assertTrue(fund1.getPositionList().get(0).getHolding().getTicker().equals("AAPL"));
		assertTrue(fund1.getPositionList().get(0).getHoldingNumber() == 50);
	}
	
	@Test
	public void testSetPositionToFund_addingTwoPositions_success() {
		fund1 = new Fund("TECHNOLOGY ENTERPRISES FUND");
		fundService.setPositionToFund(fund1, holding1, 50);
		fundService.setPositionToFund(fund1, holding1, 50);
		assertTrue(fund1.getPositionList().get(0).getHolding().getTicker().equals("AAPL"));
		assertTrue(fund1.getPositionList().get(0).getHoldingNumber() == 100);
	}

	@Test
	public void testCalculateMK() {
		fund1 = new Fund("TECHNOLOGY ENTERPRISES FUND");
		fundService.setPositionToFund(fund1, holding1, 50);
		Double result = fundService.calculateMK(fund1);
		Double expectedResult = 50 * 110.0;
		assertTrue(result.compareTo(expectedResult)==0);
	}

}
