package com.raj.crime.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.raj.crime.model.CrimeCase;
import com.raj.crime.service.CrimeCaseService;

@SpringBootTest
class CrimeCaseServiceImplTest {

	@Autowired
	 CrimeCaseService crimecaseservice;
	
	@Test
	void testAddCrime() {
		CrimeCase obj = new CrimeCase(1, 100, "Murder", "12024");
		assertEquals("AddSuccess", crimecaseservice.addCrime(obj));
	}
	
	@Test
	void testAddCrime2() {
		CrimeCase obj = null;
		assertEquals("AddFailure", crimecaseservice.addCrime(obj));
	}

	 @Test
	 void testGetCrime() {    
		 CrimeCase crimecase = new CrimeCase(1, 100, "Murder", "11-06-2024");
		 crimecaseservice.addCrime(crimecase);
		 CrimeCase retrievedcrime = crimecaseservice.getCrime(1);
	    assertNotNull(retrievedcrime);
	    assertEquals("Murder", retrievedcrime.getCasedescription());
	    assertEquals(100, retrievedcrime.getCasenumber());
	    assertEquals("11-06-2024", retrievedcrime.getDateoccour());
	 }
	 
	 
		@Test
		void testUpdateCrime() {
			 CrimeCase crimecase = new CrimeCase(1, 103, "Theft", "29-06-2024");
			 crimecaseservice.addCrime(crimecase);
			 CrimeCase retrievedcrime = crimecaseservice.getCrime(1);
			 retrievedcrime.setCasedescription("Chain Snatching");
			 assertEquals("Chain Snatching", retrievedcrime.getCasedescription());
			 assertEquals("Updatesuccess",crimecaseservice.updateCrime(retrievedcrime));
		}
		
		@Test
		void testUpdateCrime_NotFound() {
			CrimeCase obj = null;
			assertEquals("UpdateFailure", crimecaseservice.updateCrime(obj));
		}
	 
}
