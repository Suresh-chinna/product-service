package com.product.manage.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product", schema = "product_schema")
public class ProductEntity {

	@Id
	@Column(name = "product_id")
	private int productId;

	@Column(name = "product_name")
	private String productName;

	private String description;

	private double price;

	@Column(name = "manufactured_date")
	private LocalDate manufacturedDate;

	@Column(name = "expiry_date")
	private LocalDate expiryDate;

	@OneToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity categoryEntity;

	@OneToOne
	@JoinColumn(name = "type_id")
	private ProductTypeEntity productTypeEntity;

	public ProductEntity() {
		super();
	}

	public ProductEntity(int productId, String productName, String description, double price,
			LocalDate manufacturedDate, LocalDate expiryDate, CategoryEntity categoryEntity,
			ProductTypeEntity productTypeEntity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
		this.categoryEntity = categoryEntity;
		this.productTypeEntity = productTypeEntity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(LocalDate manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

	public ProductTypeEntity getProductTypeEntity() {
		return productTypeEntity;
	}

	public void setProductTypeEntity(ProductTypeEntity productTypeEntity) {
		this.productTypeEntity = productTypeEntity;
	}

}
