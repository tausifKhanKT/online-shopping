package com.tausif.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tausif.shoppingbackend.dao.CategoryDAO;
import com.tausif.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.tausif.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	
	/* * @Test public void testAddCategory() {
	 * 
	 * category = new Category(); category.setName("Mobile");
	 * category.setDescription("This is some description for mobile");
	 * category.setImageURL("CAT_101.png");
	 * 
	 * assertEquals("Successfully Added a Category inside the Table!"
	 * ,true,categoryDAO.add(category)); }
	 */

	/*
	 * @Test public void testGetCategory() {
	 * 
	 * category = categoryDAO.get(1);
	 * 
	 * assertEquals("Successfully fetched a single Category from the Table!"
	 * ,"Television",category.getName()); }
	 */

	/*
	 * @Test public void testUpdateCategory() {
	 * 
	 * category = categoryDAO.get(1); category.setName("TV");
	 * 
	 * assertEquals("Successfully updated a single Category in the Table!",
	 * true, categoryDAO.update(category)); }
	 */

	/*
	 * @Test public void testDeleteCategory() {
	 * 
	 * category = categoryDAO.get(1); assertEquals(
	 * "Successfully deleted a single Category from the Table!", true,
	 * categoryDAO.delete(category)); }
	 */

	/*
	 * @Test public void testListCategory() {
	 * 
	 * assertEquals("Successfully fetched a list of Categories from the Table!"
	 * ,2, categoryDAO.list().size()); }
	 */
	
	@Test
	public void testCRUDCategory() {
		
		//add operation
		 category = new Category(); category.setName("Laptop");
		 category.setDescription("This is some description for laptop");
		 category.setImageURL("CAT_1.png");
		  
		 assertEquals("Successfully Added a Category inside the Table!",true,categoryDAO.add(category));
		 
		 category = new Category(); category.setName("Television");
		 category.setDescription("This is some description for television");
		 category.setImageURL("CAT_2.png");
		  
		 assertEquals("Successfully Added a Category inside the Table!",true,categoryDAO.add(category));
		
		 
		 //fetching and updating category
		 category = categoryDAO.get(2); 
		 
		 category.setName("TV");
		 
		 assertEquals("Successfully updated a single Category in the Table!",true, categoryDAO.update(category));
		 
		 
		 //delete the category 
		 assertEquals("Successfully deleted a single Category from the Table!", true,categoryDAO.delete(category));
		 
		 
		 //fetching the list
		 assertEquals("Successfully fetched a list of Categories from the Table!",1, categoryDAO.list().size());
	}
}
