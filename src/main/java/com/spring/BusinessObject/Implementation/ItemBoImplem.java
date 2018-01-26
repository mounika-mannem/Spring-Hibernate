package com.spring.BusinessObject.Implementation;

import com.spring.DAObj.ItemDaObj;
import com.spring.Model.Item;
import com.spring.businesObject.ItemBusinessObj;

public class ItemBoImplem implements ItemBusinessObj{
	ItemDaObj itemDaObj;
	
	public ItemDaObj getItemDaObj() {
		return itemDaObj;
	}

	public void setItemDaObj(ItemDaObj itemDaObj) {
		this.itemDaObj = itemDaObj;
	}

	public void save(Item item) {
		itemDaObj.save(item);
		
	}

	public void update(Item item) {
		itemDaObj.update(item);
	}

	public void delete(Item item) {
		itemDaObj.delete(item);
	}

	public Item findByItemCode(String itemCode) {
		return itemDaObj.findByStockCode(itemCode);
	}

}
