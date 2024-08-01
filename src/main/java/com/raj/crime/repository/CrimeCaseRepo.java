package com.raj.crime.repository;

import java.util.List;
import com.raj.crime.model.CrimeCase;


public interface CrimeCaseRepo {
	
    public void save(CrimeCase employee);
	
	public List<CrimeCase> findAll();
	
	public CrimeCase findById(int id);
	
	public void update(CrimeCase employee);
		
	public void delete(int id);

}
