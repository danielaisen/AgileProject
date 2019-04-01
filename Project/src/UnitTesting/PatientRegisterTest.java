package UnitTesting;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Hospital.PatientRegister;
import Hospital.Patient;
import Hospital.Register;

public class PatientRegisterTest {
	
	PatientRegister patientRegister = new PatientRegister();
	
	patientRegister.add("test@email.com","Testy","McTesterson",new Date(), "male","Test Ave.",12341234,true);
	patientRegister.add("test2@email.com","Testy2","McTesterson2",new Date(), "female","Test2 Ave.",12341234,true);
	@Test
	void testSerialNumGeneration() {
		
		assertTrue()
	}

}
