package com.tausif.shoppingbackend.dao;

import java.util.List;

import com.tausif.shoppingbackend.dto.Address;
import com.tausif.shoppingbackend.dto.Cart;
import com.tausif.shoppingbackend.dto.User;

public interface UserDAO {

	// add an user
	boolean addUser(User user);
	User getByEmail(String email);
	
	// add an address
	boolean addAddress(Address address);
	
	// alternative
	Address getBillingAddress(int userId);
	List<Address> listShippingAddresses(int userId);
	
/*	Address getBillingAddress(User user);
	List<Address> listShippingAddresses(User user);*/
	
	// update a cart
	boolean updateCart(Cart cart);
}