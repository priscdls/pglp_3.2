package Priscille_DAOULAS.pglp_3_2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class allEmployeTest {
	
	@Test
	public void testSalaireTotal() {
		allEmploye e = new allEmploye();
		e.ajoutEmploye(new Vendeur(100));
		e.ajoutEmploye(new Employe(2005));
		e.ajoutEmploye(new Manager(20));
		
		assertTrue(e.totalSalaire() == 1600 + 1800 + 3500);
	}
}