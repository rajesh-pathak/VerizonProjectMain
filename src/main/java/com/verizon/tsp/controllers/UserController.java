package com.verizon.tsp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.tsp.models.Address;
import com.verizon.tsp.models.User;
import com.verizon.tsp.services.UserServiceImpl;

@RestController
@RequestMapping("/users")
//@CrossOrigin

public class UserController {

	@Autowired
	UserServiceImpl userservice;
	
	//User mappings
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(userservice.getAllUsers(),HttpStatus.OK);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> findByUserId(@PathVariable("userId") long userId) {
		
		ResponseEntity<User> resp;
		
		User user = userservice.findByUserId(userId);
		
		if (user == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(user, HttpStatus.OK);
		
		return resp;
	}
	
	@PostMapping	
	public ResponseEntity<User> createUser(@RequestBody User user) {
		ResponseEntity<User> resp = null;
		
		User user_return = userservice.createUser(user);
		
		if(user_return != null) {
			resp = new ResponseEntity<>(user_return, HttpStatus.OK);
		} else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return resp;
	}


	@DeleteMapping("{userId}")	
	public ResponseEntity<Void> deleteUser(@PathVariable("userId") int userId) {
		ResponseEntity<Void> resp = null;

		if (userservice.deleteUser(userId))
			resp = new ResponseEntity<>(HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		return resp;
	}

	//Address Mappings
	
	@GetMapping("/address")
	public ResponseEntity<List<Address>> getAllAddress(){
		return new ResponseEntity<>(userservice.getAllAddress(),HttpStatus.OK);
	}

	@GetMapping("/address/{addressId}")
	public ResponseEntity<Address> findByAddressId(@PathVariable("addressId") long addressId) {
		
		ResponseEntity<Address> resp;
		
		Address address = userservice.findByAddressId(addressId);
		
		if (address == null)
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		else
			resp = new ResponseEntity<>(address, HttpStatus.OK);
		
		return resp;
	}
	
	@PostMapping("/address")	
	public ResponseEntity<Address> createAddress(@RequestBody Address address) {
		ResponseEntity<Address> resp = null;
		
		Address address_return = userservice.createAddress(address);
		
		if(address_return != null) {
			resp = new ResponseEntity<>(address_return, HttpStatus.OK);
		} else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return resp;
	}
	
	@PutMapping("/address")	
	public ResponseEntity<Address> updateAddress(@RequestBody Address address) {
		ResponseEntity<Address> resp = null;
		
		Address address_return = userservice.updateAddress(address);
		
		if(address_return != null) {
			resp = new ResponseEntity<>(address_return, HttpStatus.OK);
		} else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return resp;
	}

	@DeleteMapping("/address{addressId}")	
	public ResponseEntity<Void> deleteAddress(@PathVariable("addressId") int addressId) {
		ResponseEntity<Void> resp = null;

		if (userservice.deleteAddress(addressId))
			resp = new ResponseEntity<>(HttpStatus.OK);
		else
			resp = new ResponseEntity<>(HttpStatus.NOT_FOUND);

		return resp;
	}
	

}
