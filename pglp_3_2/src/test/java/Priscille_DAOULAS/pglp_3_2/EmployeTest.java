package Priscille_DAOULAS.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeTest {
	
	@Test
	public void testSalaire() throws Exception {

		Employe e = new Employe(2005);
		assertTrue(e.salaire() == 1500 + (2020 - 2005) * 20);
	}

}
