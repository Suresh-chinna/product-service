package com.product.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.manage.model.ProductModel;
import com.product.manage.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/create")
	public void createProduct(@Valid @RequestBody ProductModel productModel) {
		productService.createProduct(productModel);
	}
	
	@PutMapping("/uppdate")
	public void updateProduct(@Valid @RequestBody ProductModel productModel) {
		productService.updateProduct(productModel);
	}
	
	@DeleteMapping("/delete/{productId}")
	public void deleteByProductId(@PathVariable int productId) {
		productService.deleteByProductId(productId);
	}

	@GetMapping("/findByProductId/{productId}")
	public ProductModel findByProductId(@PathVariable int productId) {
		return productService.findByProductId(productId);
	}
}
