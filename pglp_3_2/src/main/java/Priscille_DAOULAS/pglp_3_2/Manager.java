package Priscille_DAOULAS.pglp_3_2;

public class Manager extends Salaire {
	
	private final int base = 1500;
	private int nbEmployes;
	
	public Manager(int nbEmployes)
	{
		super(1500);
		this.nbEmployes=nbEmployes;
	}
	
	@Override
	public double salaire()
	{
		return base+(nbEmployes*100);
	}
}

