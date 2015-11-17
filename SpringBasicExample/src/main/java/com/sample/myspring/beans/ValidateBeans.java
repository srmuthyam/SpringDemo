package com.sample.myspring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ValidateBeans {
	public static void validateRegular() {
		Address addr = new Address();
		addr.setStreet("1 street a");
		addr.setCity("dublin");
		addr.setState("ca");
		addr.setZip("12345");
		Customer customer = new Customer("Srinivas", "Muthyam");
		customer.setAddress(addr);
		System.out.println(customer);
	}

	public static void validateSpringFileSystemContext() {
		ApplicationContext context = new FileSystemXmlApplicationContext("sample-bean.xml");
		Address addr = (Address) context.getBean("address");
		System.out.println(addr);
		Address addr1 = (Address) context.getBean("address");
		System.out.println(addr1);
		addr.setStreet("New Street");
		System.out.println("Address:" + addr);
		System.out.println("Address1:" + addr1);
		((FileSystemXmlApplicationContext) context).close();
	}
}
