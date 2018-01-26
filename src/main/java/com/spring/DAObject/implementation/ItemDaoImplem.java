package com.spring.DAObject.implementation;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.spring.DAObj.ItemDaObj;
import com.spring.Model.Item;

public class ItemDaoImplem extends HibernateDaoSupport implements ItemDaObj {

	public void save(Item item) {
		getHibernateTemplate().save(item);
	}

	public void update(Item item) {
		getHibernateTemplate().update(item);
	}

	public void delete(Item item) {
		getHibernateTemplate().delete(item);
	}

	public Item findByStockCode(String itemCode) {
		List list = getHibernateTemplate().find("from Item where itemCode=?" , itemCode);
		return (Item)list.get(0);
	}
	

}
