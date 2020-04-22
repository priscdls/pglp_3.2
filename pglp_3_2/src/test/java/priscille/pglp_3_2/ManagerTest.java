package priscille.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe Manager.
 */
public class ManagerTest {
	@Test
	public void testManagerSansEmploye() {
		Manager m = new Manager(0);
		assertTrue(m.salaire() == 1500 + 0);
	}
	
	@Test
	public void testManagerAvecEmploye() {
		Manager m = new Manager(10);
		assertTrue(m.salaire() == 1500 + 10 * 100);
	}
}
