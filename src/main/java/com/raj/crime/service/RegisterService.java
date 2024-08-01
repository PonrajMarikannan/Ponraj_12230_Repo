package com.raj.crime.service;

import com.raj.crime.model.Register;


public interface RegisterService {
	
	public void addUser(Register emp);

	public Register findByUserName(String email);
	
	
}
 