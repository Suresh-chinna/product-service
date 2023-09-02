package com.product.manage.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.product.manage.entity.CategoryEntity;
import com.product.manage.entity.ProductEntity;
import com.product.manage.entity.ProductTypeEntity;
import com.product.manage.model.CategoryModel;
import com.product.manage.model.ProductModel;
import com.product.manage.model.ProductTypeModel;


@Component
public class ProductModelMapper {
	
	public ProductModel entityToProductModel(ProductEntity productEntity) {
		ProductModel productModel = new ProductModel();
		BeanUtils.copyProperties(productEntity, productModel);
		productModel.setProductCategoryModel(entityToCategoryModel(productEntity.getCategoryEntity()));
		productModel.setProductTypeModel(entityToProductTypeModel(productEntity.getProductTypeEntity()));
		return productModel;
	}
	public CategoryModel entityToCategoryModel(CategoryEntity categoryEntity) {
		CategoryModel categoryModel=new CategoryModel();
		BeanUtils.copyProperties(categoryEntity, categoryModel);
		return categoryModel;
	}
	public ProductTypeModel entityToProductTypeModel(ProductTypeEntity productTypeEntity) {
		ProductTypeModel productTypeModel=new ProductTypeModel();
		BeanUtils.copyProperties(productTypeEntity, productTypeModel);
		return productTypeModel;
	}
	

}
