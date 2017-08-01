package com.tausif.shoppingbackend.dao;

import java.util.List;

import com.tausif.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
