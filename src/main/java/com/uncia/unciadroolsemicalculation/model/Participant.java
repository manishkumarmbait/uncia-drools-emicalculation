package com.uncia.unciadroolsemicalculation.model;

public class Participant {

	private int age;
	private int creditScore;
	private long annualSalary;
	private long existingDebt;
	private long loanAmount;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public long getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}

	public long getExistingDebt() {
		return existingDebt;
	}

	public void setExistingDebt(long existingDebt) {
		this.existingDebt = existingDebt;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

}
