package org.jsp.springtest.controller;

import java.util.Scanner;

import org.jsp.springtest.MerchantConfig;
import org.jsp.springtest.ProductConfig;
import org.jsp.springtest.dao.MerchantDao;
import org.jsp.springtest.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MerchantController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(MerchantConfig.class, ProductConfig.class);
		MerchantDao merchantDao = context.getBean(MerchantDao.class);
		System.out.println("1.Save Merchant");
		System.out.println("2.Update Merchant");
		System.out.println("3.Find Merchant by id");
		System.out.println("4.Verify merchant by Phone and password");
		System.out.println("5.Verify merchant by email and password");
		System.out.println("6.find merchant by product");

		switch (sc.nextInt()) {
		case 1: {
			Merchant merchant = new Merchant();
			System.out.println("Enter Merchant name:");
			merchant.setName(sc.next());
			System.out.println("Enter Merchant phone no:");
			merchant.setPhone(sc.nextLong());
			System.out.println("Enter Merchant email id:");
			merchant.setEmail(sc.next());
			System.out.println("Enter merchant gst no.:");
			merchant.setGst_number(sc.next());
			System.out.println("Enter password:");
			merchant.setPassword(sc.next());
			merchant = merchantDao.saveMerchant(merchant);
			System.out.println("Merchant saved with id " + merchant.getId());
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
