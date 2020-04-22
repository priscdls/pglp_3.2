package priscille.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe Employe.
 */
public class EmployeTest {
	
	@Test
	public void testSalaire() throws Exception {
		Employe e = new Employe(2005);
		assertTrue(e.salaire() == 1500 + (2020 - 2005) * 20);
	}

	@Test (expected = Exception.class)
	public void testAnneeIncorrect() throws Exception {
		Employe e = new Employe(2030);
		assertTrue(e.salaire() == 1500 + (2020 - 2030) * 20);
	}
}
