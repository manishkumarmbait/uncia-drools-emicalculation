package com.uncia.unciadroolsemicalculation.model;

public class ResponseRejection {

	private String status = "Qualified";
	private String message = "";

	public ResponseRejection() {
	}

	public ResponseRejection(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void addMessage(String message) {
		if (this.message.equals("")) {
			this.message = message;
		} else {
			this.message = this.message + "; " + message;
		}
	}
}
