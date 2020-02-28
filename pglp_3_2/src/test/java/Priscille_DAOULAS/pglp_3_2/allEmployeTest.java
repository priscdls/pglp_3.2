package Priscille_DAOULAS.pglp_3_2;

import java.util.ArrayList;

import org.junit.Test;

public class allEmployeTest {
	
	@Test
	public void test()
	{
		Employe e1 = new Employe(2010);
		ArrayList <allEmploye> listEmploye = new ArrayList<allEmploye>();
		listEmploye.add(e1);
		listEmploye.add(new Employe(2005));
		listEmploye.add(new Vendeur(15));
		listEmploye.add(new Vendeur(25));
		listEmploye.add(new Manager(20));
		
		double salaireTotal = 0;
		for(int i = 0; i < listEmploye.size(); i++)
		{
			salaireTotal += listEmploye.get(i).salaire();
		}
		System.out.println("Salaire total : "+ salaireTotal);
	}
}