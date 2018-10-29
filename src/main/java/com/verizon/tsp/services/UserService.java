package com.verizon.tsp.services;

import java.util.List;

import com.verizon.tsp.models.Address;
import com.verizon.tsp.models.User;

public interface UserService {

	//User service
	public List<User> getAllUsers();
	public User findByUserId(long userId); //getbyid
	public User createUser(User user);
	public boolean deleteUser(long userId);
	
	//Address service
	public List<Address> getAllAddress();
	public Address findByAddressId(long addressId); //getbyid
	public Address createAddress(Address address);
	public Address updateAddress(Address address);
	public boolean deleteAddress(long addressId);
	
}
