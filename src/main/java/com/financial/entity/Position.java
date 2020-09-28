package com.financial.entity;

public class Position {
	private Holding holding;
	private Integer holdingNumber;
	/**
	 * @return the holding
	 */
	public Holding getHolding() {
		return holding;
	}
	/**
	 * @param holding the holding to set
	 */
	public void setHolding(Holding holding) {
		this.holding = holding;
	}
	/**
	 * @return the holdingNumber
	 */
	public Integer getHoldingNumber() {
		return holdingNumber;
	}
	/**
	 * @param holdingNumber the holdingNumber to set
	 */
	public void setHoldingNumber(Integer holdingNumber) {
		this.holdingNumber = holdingNumber;
	}
	public Position(Holding holding, Integer holdingNumber) {
		super();
		this.holding = holding;
		this.holdingNumber = holdingNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Position [holding=" + holding + ", holdingNumber=" + holdingNumber + "]";
	}
	
	
}
