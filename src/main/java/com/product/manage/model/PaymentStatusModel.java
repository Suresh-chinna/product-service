package com.product.manage.model;

public class PaymentStatusModel {
	private int paymentStatusId;
	private String paymentStatus;

	public PaymentStatusModel() {
		super();
	}

	public PaymentStatusModel(int paymentStatusId, String paymentStatus) {
		super();
		this.paymentStatusId = paymentStatusId;
		this.paymentStatus = paymentStatus;
	}

	public int getPaymentStatusId() {
		return paymentStatusId;
	}

	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@Override
	public String toString() {
		return "PaymentStatusModel [paymentStatusId=" + paymentStatusId + ", paymentStatus=" + paymentStatus + "]";
	}

}
