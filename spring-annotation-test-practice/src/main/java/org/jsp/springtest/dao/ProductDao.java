package org.jsp.springtest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.springtest.dto.Merchant;
import org.jsp.springtest.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	@Autowired
	private EntityManager entityManager;

	public Product saveProduct(Product product, int merchant_id) {
		Merchant merchant = entityManager.find(Merchant.class, merchant_id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (merchant != null) {
			product.setMerchant(merchant);
			List<Product> products = merchant.getProducts();
			products.add(product);
			merchant.setProducts(products);
			merchant.getProducts().add(product);
			entityManager.persist(product);
			entityTransaction.begin();
			entityTransaction.commit();
			return product;
		}
		return null;
	}
	
	public Product updateProduct(Product product) {
	Product dbproduct = entityManager.find(Product.class, product.getId());
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (dbproduct != null) {
			dbproduct.setName(product.getName());
			dbproduct.setBrand(product.getBrand());
			dbproduct.setCategory(product.getCategory());
			dbproduct.setDescription(product.getDescription());
			dbproduct.setImg_url(product.getImg_url());
			entityTransaction.begin();
			entityTransaction.commit();
			return dbproduct;
		}
		return null;
	}

}
