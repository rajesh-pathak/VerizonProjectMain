package com.verizon.tsp.services;

import java.util.List;

import com.verizon.tsp.models.CSA;

public interface CSAService {
	
	public List<CSA> getAllCSA();
	public CSA findByCSAId(long csaId); //getbyid
	public CSA createCSA(CSA csa);
	public CSA updateCSA(CSA csa);
	public boolean deleteCSA(long csaId);

}
