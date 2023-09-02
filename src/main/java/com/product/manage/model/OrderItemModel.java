package com.product.manage.model;

public class OrderItemModel {
	private int OrderItemId;
	private double price;
	private int quantity;
	private double subTotalAmount;

	public OrderItemModel() {
		super();
	}

	public OrderItemModel(int orderItemId, double price, int quantity, double subTotalAmount) {
		super();
		OrderItemId = orderItemId;
		this.price = price;
		this.quantity = quantity;
		this.subTotalAmount = subTotalAmount;
	}

	public int getOrderItemId() {
		return OrderItemId;
	}

	public void setOrderItemId(int orderItemId) {
		OrderItemId = orderItemId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSubTotalAmount() {
		return subTotalAmount;
	}

	public void setSubTotalAmount(double subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}

	@Override
	public String toString() {
		return "OrderItemModel [OrderItemId=" + OrderItemId + ", price=" + price + ", quantity=" + quantity
				+ ", subTotalAmount=" + subTotalAmount + "]";
	}

}
