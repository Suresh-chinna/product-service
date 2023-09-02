package com.product.manage.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manage.entity.ProductEntity;
import com.product.manage.exception.ProductNotFound;
import com.product.manage.mapper.ProductEntityMapper;
import com.product.manage.mapper.ProductModelMapper;
import com.product.manage.model.ProductModel;
import com.product.manage.repository.ProductDao;
import com.product.manage.service.ProductService;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ProductModelMapper productModelMapper;

	@Autowired
	private ProductEntityMapper productEntityMapper;

	@Override
	public void createProduct(ProductModel productModel) {
		productDao.save(productEntityMapper.modelToProductEntity(productModel));
	}

	@Override
	public void updateProduct(ProductModel productModel) {
		productDao.save(productEntityMapper.modelToProductEntity(productModel));
	}

	@Override
	public void deleteByProductId(int productId) {
		productDao.deleteById(productId);
	}

	@Override
	public ProductModel findByProductId(int productId) {
		Optional<ProductEntity> productEntityOptional = productDao.findById(productId);
		if (productEntityOptional.isPresent()) {
			return productModelMapper.entityToProductModel(productEntityOptional.get());
		} else {
			throw new ProductNotFound("product is not found for the given productId--->"+productId);
		}
	}

}
