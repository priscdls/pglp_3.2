package Priscille_DAOULAS.pglp_3_2;

import java.util.ArrayList;

public class allEmploye {
	private ArrayList <Salaire> listEmploye;
	
	public allEmploye() {
		listEmploye = new ArrayList <Salaire> ();
	}
	
	public void ajoutEmploye(Salaire s) {
		if(listEmploye.contains(s) == false) {
			listEmploye.add(s);
		}
	}
	
	public void retireEmploye(Salaire s) {
		if(listEmploye.contains(s)) {
			listEmploye.remove(s);
		}
	}
	
	public double totalSalaire() {
		double totalSalaire = 0.0;
		for(Salaire s : listEmploye) {
			totalSalaire += s.salaire();
		}
		return totalSalaire;
	}
}
