package com.verizon.tsp.services;

import java.util.List;

import com.verizon.tsp.models.Tickets;

public interface TicketsService {

	public List<Tickets> getAllTicket();
	public Tickets createTicket(Tickets tkt);
	public Tickets updateTicket(Tickets tkt);
}
