package com.verizon.tsp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.verizon.tsp.dao.TicketsDao;
import com.verizon.tsp.models.Tickets;

@Service
public class TicketsServiceImpl implements TicketsService{

	@Autowired
	TicketsDao tktdao;
	
	@Override
	public List<Tickets> getAllTicket() {
		return tktdao.findAll();
	}

	@Override
	public Tickets createTicket(Tickets tkt) {
		return tktdao.save(tkt);
		
	}

	@Override
	public Tickets updateTicket(Tickets tkt) {
		return tktdao.save(tkt);
	}

}
