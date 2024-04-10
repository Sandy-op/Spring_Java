package org.jsp.springtest.controller;

import java.util.Scanner;

import org.jsp.springtest.MerchantConfig;
import org.jsp.springtest.ProductConfig;
import org.jsp.springtest.dao.ProductDao;
import org.jsp.springtest.dto.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfig.class, MerchantConfig.class);
		ProductDao productDao = context.getBean(ProductDao.class);
		System.out.println("1.Save Product");
		System.out.println("2.Update Product");
		System.out.println("3.Fetch product by product id");
		System.out.println("4.Fetch product by merchant id");
		switch (sc.nextInt()) {
		case 1: {
			Product product = new Product();
			System.out.println("Enter Merchant id to save product:");
			int merchant_id = sc.nextInt();
			System.out.println("Enter product name, brand, category, description and image url");
			product.setName(sc.next());
			product.setBrand(sc.next());
			product.setCategory(sc.next());
			product.setDescription(sc.next());
			product.setImg_url(sc.next());
			product = productDao.saveProduct(product, merchant_id);
			if (product != null) {
				System.out.println("Product saved with id" + product.getId());
			} else {
				System.err.println("Cannot save product as Merchant id is invalid");
			}
			break;
		}
		case 2: {
			Product product = new Product();
			System.out.println("Enter product id to update product:");
			product.setId(sc.nextInt());
			System.out.println("Enter product name, brand, category, description and image url");
			product.setName(sc.next());
			product.setBrand(sc.next());
			product.setCategory(sc.next());
			product.setDescription(sc.next());
			product.setImg_url(sc.next());
			product = productDao.updateProduct(product);
			if (product != null) {
				System.out.println("Product with id "+product.getId()+" updated");
			} else {
				System.err.println("Cannot update product as product id is invalid");
			}
			break;
		}
		default: {
			System.err.println("Invalid Choice");
			sc.close();
			((AnnotationConfigApplicationContext) context).close();
		}
		}
	}
}
