package com.uncia.unciadroolsemicalculation.model;

public class RejectionData {

	private int age;
	private long income;
	private int noOfAddressChangeInLastOneYear;
	private int enqForPLInlastOneYear;
	private int noOfChequeReturn;
	private float averageQuaterlyBalance;
	private int cibilScore;
	private int dpdGreaterThan30InLastOneYear;
	private float missedPaymentRatio;

	public RejectionData() {
	}

	public RejectionData(int age, long income, int noOfAddressChangeInLastOneYear, int enqForPLInlastOneYear,
			int noOfChequeReturn, float averageQuaterlyBalance, int cibilScore, int dpdGreaterThan30InLastOneYear,
			float missedPaymentRatio) {
		this.age = age;
		this.income = income;
		this.noOfAddressChangeInLastOneYear = noOfAddressChangeInLastOneYear;
		this.enqForPLInlastOneYear = enqForPLInlastOneYear;
		this.noOfChequeReturn = noOfChequeReturn;
		this.averageQuaterlyBalance = averageQuaterlyBalance;
		this.cibilScore = cibilScore;
		this.dpdGreaterThan30InLastOneYear = dpdGreaterThan30InLastOneYear;
		this.missedPaymentRatio = missedPaymentRatio;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public int getNoOfAddressChangeInLastOneYear() {
		return noOfAddressChangeInLastOneYear;
	}

	public void setNoOfAddressChangeInLastOneYear(int noOfAddressChangeInLastOneYear) {
		this.noOfAddressChangeInLastOneYear = noOfAddressChangeInLastOneYear;
	}

	public int getEnqForPLInlastOneYear() {
		return enqForPLInlastOneYear;
	}

	public void setEnqForPLInlastOneYear(int enqForPLInlastOneYear) {
		this.enqForPLInlastOneYear = enqForPLInlastOneYear;
	}

	public int getNoOfChequeReturn() {
		return noOfChequeReturn;
	}

	public void setNoOfChequeReturn(int noOfChequeReturn) {
		this.noOfChequeReturn = noOfChequeReturn;
	}

	public float getAverageQuaterlyBalance() {
		return averageQuaterlyBalance;
	}

	public void setAverageQuaterlyBalance(float averageQuaterlyBalance) {
		this.averageQuaterlyBalance = averageQuaterlyBalance;
	}

	public int getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}

	public int getDpdGreaterThan30InLastOneYear() {
		return dpdGreaterThan30InLastOneYear;
	}

	public void setDpdGreaterThan30InLastOneYear(int dpdGreaterThan30InLastOneYear) {
		this.dpdGreaterThan30InLastOneYear = dpdGreaterThan30InLastOneYear;
	}

	public float getMissedPaymentRatio() {
		return missedPaymentRatio;
	}

	public void setMissedPaymentRatio(float missedPaymentRatio) {
		this.missedPaymentRatio = missedPaymentRatio;
	}

}
