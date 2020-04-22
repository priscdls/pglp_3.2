package priscille.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Tests unitaires de la classe Vendeur.
 */
public class VendeurTest {
	@Test
	public void testVendeurSansCommission() {
		Vendeur v = new Vendeur(0);
		assertTrue(v.salaire() == 1500 + 0);
	}
	
	@Test
	public void testVendeurAvecCommission() {
		Vendeur v = new Vendeur(10);
		assertTrue(v.salaire() == 1500 + 10);
	}
}
