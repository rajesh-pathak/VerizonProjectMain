package com.verizon.tsp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.verizon.tsp.models.CSA;
import com.verizon.tsp.models.Tickets;
import com.verizon.tsp.services.TicketsServiceImpl;

@RestController
@RequestMapping("/tickets")
//@CrossOrigin
public class TicketsController {

	@Autowired
	TicketsServiceImpl tktservice;
	
	@GetMapping
	public ResponseEntity<List<Tickets>> getAllTicket(){
		return new ResponseEntity<>(tktservice.getAllTicket(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Tickets> createTicket(@RequestBody Tickets tkt) {
		ResponseEntity<Tickets> resp = null;
		
		Tickets tkt_return = tktservice.createTicket(tkt);
		
		if(tkt_return != null) {
			resp = new ResponseEntity<>(tkt_return, HttpStatus.OK);
		} else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return resp;
	}

	@PutMapping
	public ResponseEntity<Tickets> updateTicket(@RequestBody Tickets tkt) {
		ResponseEntity<Tickets> resp = null;
		
		Tickets tkt_return = tktservice.updateTicket(tkt);
		
		if(tkt_return != null) {
			resp = new ResponseEntity<>(tkt_return, HttpStatus.OK);
		} else
			resp = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		return resp;
	}


}

