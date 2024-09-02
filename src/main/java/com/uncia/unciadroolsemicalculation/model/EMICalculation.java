package com.uncia.unciadroolsemicalculation.model;

public class EMICalculation {

	private double principal;
	private double rate;
	private double time;
	private long monthlyFixedIncome;
	private double savingPercentage;
	private double otherEMI;
	private int amountInLakh;

	public EMICalculation() {
	}

	public EMICalculation(double principal, double rate, double time, long monthlyFixedIncome, double savingPercentage,
			double otherEMI, int amountInLakh) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		this.monthlyFixedIncome = monthlyFixedIncome;
		this.savingPercentage = savingPercentage;
		this.otherEMI = otherEMI;
		this.amountInLakh = amountInLakh;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public long getMonthlyFixedIncome() {
		return monthlyFixedIncome;
	}

	public void setMonthlyFixedIncome(long monthlyFixedIncome) {
		this.monthlyFixedIncome = monthlyFixedIncome;
	}

	public double getSavingPercentage() {
		return savingPercentage;
	}

	public void setSavingPercentage(double savingPercentage) {
		this.savingPercentage = savingPercentage;
	}

	public double getOtherEMI() {
		return otherEMI;
	}

	public void setOtherEMI(double otherEMI) {
		this.otherEMI = otherEMI;
	}

	public int getAmountInLakh() {
		return amountInLakh;
	}

	public void setAmountInLakh(int amountInLakh) {
		this.amountInLakh = amountInLakh;
	}

}
