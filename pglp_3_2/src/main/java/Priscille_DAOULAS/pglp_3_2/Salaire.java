package Priscille_DAOULAS.pglp_3_2;

/**
 * Classe représentant la base de salaire d'un employé, manager,vendeur.
 */
public abstract class Salaire {
	/**
	 * Salaire de base.
	 */
	protected final int base;
	/**
	 * Constructeur.
	 * @param base Salaire de base
	 */
	public Salaire(final int base) {
		this.base = base;
	}
	/**
	 * Fonction calculant le salaire d'un employé.
	 * @return Le salaire 
	 */
	public abstract double salaire();
}
