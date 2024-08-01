package com.raj.crime.repository;

import java.util.List;
import com.raj.crime.model.Criminal;



public interface CriminalRepo  {

	public String save(Criminal cml);
	
	public List<Criminal> findAll();

	public Criminal findById(int id);

	public String update(Criminal cml);

	public void deleteById(int id);

}
