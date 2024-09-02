package com.uncia.unciadroolsemicalculation.model;

public class ResponseScore {

	private int score;

	public ResponseScore() {
	}

	public ResponseScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void addScore(int add) {
		this.score += add;
	}
}
