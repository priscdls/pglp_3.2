package Priscille_DAOULAS.pglp_3_2;

public class Vendeur extends allEmploye {
	final private int base = 2000;
	private int commission;
	
	public Vendeur (int commission){
		this.commission = commission;
	}
	
	@Override
	public double salaire(){
		return base + commission;
	}
}
