package Priscille_DAOULAS.pglp_3_2;

public class Manager extends allEmploye {
	
	private final int base = 1500;
	private int nbEmployes;
	
	public Manager(int nbEmployes)
	{
		this.nbEmployes=nbEmployes;
	}
	
	@Override
	public double salaire()
	{
		return base+(nbEmployes*100);
	}
}

