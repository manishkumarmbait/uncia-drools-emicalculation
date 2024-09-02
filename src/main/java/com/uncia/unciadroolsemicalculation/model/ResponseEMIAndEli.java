package com.uncia.unciadroolsemicalculation.model;

public class ResponseEMIAndEli {

	private double emi;
	private double loanEligibilityAmount;

	public ResponseEMIAndEli() {
	}

	public ResponseEMIAndEli(double emi, double loanEligibilityAmount) {
		this.emi = emi;
		this.loanEligibilityAmount = loanEligibilityAmount;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public double getLoanEligibilityAmount() {
		return loanEligibilityAmount;
	}

	public void setLoanEligibilityAmount(double loanEligibilityAmount) {
		this.loanEligibilityAmount = loanEligibilityAmount;
	}

}
