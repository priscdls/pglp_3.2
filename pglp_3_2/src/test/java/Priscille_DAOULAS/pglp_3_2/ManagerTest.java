package Priscille_DAOULAS.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe Manager.
 */
public class ManagerTest {
	@Test
	public void testManager() {

		Manager m = new Manager(10);
		assertTrue(m.salaire() == 1500 + 1000);

	}
}
