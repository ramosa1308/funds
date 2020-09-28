package com.financial.entity;

public class Holding {
	private Double price;
	private String ticker;
	
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the ticker
	 */
	public String getTicker() {
		return ticker;
	}
	/**
	 * @param ticker the ticker to set
	 */
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public Holding(Double price, String ticker) {
		super();
		this.price = price;
		this.ticker = ticker;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Holding [price=" + price + ", ticker=" + ticker + "]";
	}
	
	
	
}
