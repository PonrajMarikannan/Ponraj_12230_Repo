package com.raj.crime.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.raj.crime.model.CrimeCase;
import com.raj.crime.repository.CrimeCaseRepo;
import com.raj.crime.service.CrimeCaseService;


@Service
public class CrimeCaseServiceImpl implements CrimeCaseService {

	@Autowired
	CrimeCaseRepo repo;
		
	@Override
	public String addCrime(CrimeCase crime) {
		if(crime!=null) {
	        repo.save(crime);
	        return "AddSuccess";
		}else {
			return "AddFailure";
		}
	}
	
	@Override
	public CrimeCase getCrime(int id) {
		
		CrimeCase optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
            return optionalCrime;
        } else {
           return null;
        } 
        
        
	}
	
	@Override
	public List<CrimeCase> getAllCrime() {
		return repo.findAll();
	}
	
	@Override
	public String updateCrime(CrimeCase crime) {
		
		if(crime!=null) {
	        repo.save(crime);
	        return "Updatesuccess";
		}
		else {
			return "UpdateFailure";
		}
		
	}

	
	public String deleteCrime(int id) {
		
		CrimeCase optionalCrime = repo.findById(id);
		 
        if (optionalCrime!=null) {
        	repo.delete(id);
            return "DeleteSuccess";
        } else {
            return null;
        }   
    }
	
}
