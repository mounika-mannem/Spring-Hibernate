package com.spring.DAObj;

import com.spring.Model.Item;

public interface ItemDaObj {
	
	void save(Item item);
	void update(Item item);
	void delete(Item item);
	Item findByStockCode(String itemCode);

}
