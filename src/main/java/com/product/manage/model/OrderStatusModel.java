package com.product.manage.model;

public class OrderStatusModel {
	private int orderStatusId;
	private String orderStatus;

	public OrderStatusModel() {
		super();
	}

	public OrderStatusModel(int orderStatusId, String orderStatus) {
		super();
		this.orderStatusId = orderStatusId;
		this.orderStatus = orderStatus;
	}

	public int getOrderStatusId() {
		return orderStatusId;
	}

	public void setOrderStatusId(int orderStatusId) {
		this.orderStatusId = orderStatusId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "OrderStatusModel [orderStatusId=" + orderStatusId + ", orderStatus=" + orderStatus + "]";
	}

}
