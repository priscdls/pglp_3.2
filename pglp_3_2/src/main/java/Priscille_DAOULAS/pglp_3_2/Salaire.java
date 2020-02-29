package Priscille_DAOULAS.pglp_3_2;

public abstract class Salaire {
	protected final int base;
	public Salaire(int base)
	{
		this.base=base;
	}
	public abstract double salaire();
}
