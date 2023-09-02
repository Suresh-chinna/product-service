package com.product.manage.model;

import java.time.LocalDate;
import java.util.List;

public class OrdersModel {
	private int orderId;
	private String description;
	private LocalDate orderdate;
	private double orderTotalAmount;
	private int totalItems;

	private List<OrderItemModel> orderItemModelList;
	private PaymentStatusModel paymentStatusModel;
	private ShipmentStatusModel shipementStatusModel;
	private OrderStatusModel orderStatusModel;

	public OrdersModel() {
		super();
	}

	public OrdersModel(int orderId, String description, LocalDate orderdate, double orderTotalAmount, int totalItems,
			List<OrderItemModel> orderItemModelList, PaymentStatusModel paymentStatusModel,
			ShipmentStatusModel shipementStatusModel, OrderStatusModel orderStatusModel) {
		super();
		this.orderId = orderId;
		this.description = description;
		this.orderdate = orderdate;
		this.orderTotalAmount = orderTotalAmount;
		this.totalItems = totalItems;
		this.orderItemModelList = orderItemModelList;
		this.paymentStatusModel = paymentStatusModel;
		this.shipementStatusModel = shipementStatusModel;
		this.orderStatusModel = orderStatusModel;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public double getOrderTotalAmount() {
		return orderTotalAmount;
	}

	public void setOrderTotalAmount(double orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public List<OrderItemModel> getOrderItemModelList() {
		return orderItemModelList;
	}

	public void setOrderItemModelList(List<OrderItemModel> orderItemModelList) {
		this.orderItemModelList = orderItemModelList;
	}

	public PaymentStatusModel getPaymentStatusModel() {
		return paymentStatusModel;
	}

	public void setPaymentStatusModel(PaymentStatusModel paymentStatusModel) {
		this.paymentStatusModel = paymentStatusModel;
	}

	public ShipmentStatusModel getShipementStatusModel() {
		return shipementStatusModel;
	}

	public void setShipementStatusModel(ShipmentStatusModel shipementStatusModel) {
		this.shipementStatusModel = shipementStatusModel;
	}

	public OrderStatusModel getOrderStatusModel() {
		return orderStatusModel;
	}

	public void setOrderStatusModel(OrderStatusModel orderStatusModel) {
		this.orderStatusModel = orderStatusModel;
	}

	@Override
	public String toString() {
		return "OrdersModel [orderId=" + orderId + ", description=" + description + ", orderdate=" + orderdate
				+ ", orderTotalAmount=" + orderTotalAmount + ", totalItems=" + totalItems + ", orderItemModelList="
				+ orderItemModelList + ", paymentStatusModel=" + paymentStatusModel + ", shipementStatusModel="
				+ shipementStatusModel + ", orderStatusModel=" + orderStatusModel + "]";
	}

}
