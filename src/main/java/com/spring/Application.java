package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Model.Item;
import com.spring.businesObject.ItemBusinessObj;

public class Application {
	
	public static void main( String[] args) {
		

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		
		ItemBusinessObj itemBuObj = (ItemBusinessObj) context.getBean("itembusinessObj");
		
		Item item = new Item();
		item.setItemCode("5678");
		item.setItemName("PELO");
		itemBuObj.save(item);
	
	Item item2 = itemBuObj.findByItemCode("5678");
	System.out.println(item2);
	
	item2.setItemName("PELO-1");
	itemBuObj.update(item2);
	
	itemBuObj.delete(item2);
	System.out.println("Done");
	
	
	
		
	}

}
