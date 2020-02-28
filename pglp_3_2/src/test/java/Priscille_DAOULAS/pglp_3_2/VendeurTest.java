package Priscille_DAOULAS.pglp_3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendeurTest {
	@Test

	public void testVendeur() {

		Vendeur v = new Vendeur(10);
		assertTrue(v.salaire() == 1500 + 10);

	}

}
