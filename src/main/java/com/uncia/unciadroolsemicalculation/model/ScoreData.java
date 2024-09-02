package com.uncia.unciadroolsemicalculation.model;

public class ScoreData {

	private int age;
	private long income;
	private String employmentType;
	private int noOfAddressChangeInLastOneYear;
	private int enqForPLInLastOneYear;
	private int noOfChequeReturn;
	private float averageQuaterlyBalance;
	private int cibilScore;
	private int dpdGreaterThan30InLastOneYear;
	private int ageOfOldestLoanAccount;
	private float missedPaymentRatio;
	private int noOfTradeLineClosedInTime;
	private String activeTradeLines;

	public ScoreData() {
	}

	public ScoreData(int age, long income, String employmentType, int noOfAddressChangeInLastOneYear,
			int enqForPLInLastOneYear, int noOfChequeReturn, float averageQuaterlyBalance, int cibilScore,
			int dpdGreaterThan30InLastOneYear, int ageOfOldestLoanAccount, float missedPaymentRatio,
			int noOfTradeLineClosedInTime, String activeTradeLines) {
		super();
		this.age = age;
		this.income = income;
		this.employmentType = employmentType;
		this.noOfAddressChangeInLastOneYear = noOfAddressChangeInLastOneYear;
		this.enqForPLInLastOneYear = enqForPLInLastOneYear;
		this.noOfChequeReturn = noOfChequeReturn;
		this.averageQuaterlyBalance = averageQuaterlyBalance;
		this.cibilScore = cibilScore;
		this.dpdGreaterThan30InLastOneYear = dpdGreaterThan30InLastOneYear;
		this.ageOfOldestLoanAccount = ageOfOldestLoanAccount;
		this.missedPaymentRatio = missedPaymentRatio;
		this.noOfTradeLineClosedInTime = noOfTradeLineClosedInTime;
		this.activeTradeLines = activeTradeLines;
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

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public int getNoOfAddressChangeInLastOneYear() {
		return noOfAddressChangeInLastOneYear;
	}

	public void setNoOfAddressChangeInLastOneYear(int noOfAddressChangeInLastOneYear) {
		this.noOfAddressChangeInLastOneYear = noOfAddressChangeInLastOneYear;
	}

	public int getEnqForPLInLastOneYear() {
		return enqForPLInLastOneYear;
	}

	public void setEnqForPLInLastOneYear(int enqForPLInLastOneYear) {
		this.enqForPLInLastOneYear = enqForPLInLastOneYear;
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

	public int getAgeOfOldestLoanAccount() {
		return ageOfOldestLoanAccount;
	}

	public void setAgeOfOldestLoanAccount(int ageOfOldestLoanAccount) {
		this.ageOfOldestLoanAccount = ageOfOldestLoanAccount;
	}

	public float getMissedPaymentRatio() {
		return missedPaymentRatio;
	}

	public void setMissedPaymentRatio(float missedPaymentRatio) {
		this.missedPaymentRatio = missedPaymentRatio;
	}

	public int getNoOfTradeLineClosedInTime() {
		return noOfTradeLineClosedInTime;
	}

	public void setNoOfTradeLineClosedInTime(int noOfTradeLineClosedInTime) {
		this.noOfTradeLineClosedInTime = noOfTradeLineClosedInTime;
	}

	public String getActiveTradeLines() {
		return activeTradeLines;
	}

	public void setActiveTradeLines(String activeTradeLines) {
		this.activeTradeLines = activeTradeLines;
	}

}
