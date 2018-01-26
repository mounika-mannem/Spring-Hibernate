package com.spring.businesObject;

import com.spring.Model.Item;

public interface ItemBusinessObj {
	
	void save(Item item);
	void update(Item item);
	void delete(Item item);
	
	Item findByItemCode(String itemCode);


}
