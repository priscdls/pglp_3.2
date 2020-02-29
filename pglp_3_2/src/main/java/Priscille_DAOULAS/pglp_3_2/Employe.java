package Priscille_DAOULAS.pglp_3_2;

public class Employe extends Salaire {
	private final int startYear;
	
	public Employe(int startYear){
		super(1500);
		this.startYear = startYear;
	}
	
	@Override
	public double salaire() {
		return base + (2020 - this.startYear) * 20;
	}
}

