package Priscille_DAOULAS.pglp_3_2;

public class Vendeur extends Salaire {
	private int commission;
	
	public Vendeur(int commission) {
		super(1500);
		this.commission = commission;
	}
	
	@Override
	public double salaire(){
		return base + commission;
	}
}
