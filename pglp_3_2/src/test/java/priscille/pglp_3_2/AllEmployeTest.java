package priscille.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe AllEmploye.
 */
public class AllEmployeTest {
	
	@Test
	public void testSalaireTotal() throws Exception {
		AllEmploye e = new AllEmploye();
		e.ajoutEmploye(new Vendeur(100));
		e.ajoutEmploye(new Employe(2005));
		e.ajoutEmploye(new Manager(20));
		
		assertTrue(e.totalSalaire() == (1500 + 100) + (1500 + (2020 - 2005) * 20) + (1500 + 100 * 20));
	}
}