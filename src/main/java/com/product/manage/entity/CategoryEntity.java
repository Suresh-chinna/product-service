package com.product.manage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category", schema = "product_schema")
public class CategoryEntity {

	@Id
	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "category_name")
	private String categoryName;

	public CategoryEntity() {
		super();
	}

	public CategoryEntity(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
