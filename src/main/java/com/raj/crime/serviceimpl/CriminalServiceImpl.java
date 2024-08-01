package com.raj.crime.serviceimpl;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raj.crime.model.Criminal;
import com.raj.crime.repository.CriminalRepo;
import com.raj.crime.service.CriminalService;

@Service
public class CriminalServiceImpl implements CriminalService {

	@Autowired
	CriminalRepo repo;
	
	public String addCriminal(Criminal cml) {
		
		if(cml!=null) {
	        repo.save(cml);
	        return "AddSuccess1";
		}else {
			return "AddFailure1";
		}
	}
	
	public List<Criminal> getAllCriminal() {
		return repo.findAll();
	}
	
	
	public Criminal getCriminal(int id) {
		
		Criminal optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
            return optionalCrime;
        } else {
            return null;
        }    
		
}
	
	public String updateCriminal(Criminal cml) {
		
		if(cml!=null) {
	        repo.update(cml);
	        return "UpdateSuccess1";
		}
		else {
			return "UpdateFailure1";
		}
	}
 
	public void deleteCriminalById(int id) {
		repo.deleteById(id);
	}
}
