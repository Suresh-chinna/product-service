package com.product.manage.model;

public class CategoryModel {

	private int categoryId;
	private String categoryName;

	public CategoryModel() {
	}

	public CategoryModel(int categoryId, String categoryName) {
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

	@Override
	public String toString() {
		return "CategoryModel [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}

}
