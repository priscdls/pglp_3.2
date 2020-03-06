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
	 * @param Base Salaire de base
	 */
	public Salaire(final int Base) {
		this.base = Base;
	}
	/**
	 * Fonction calculant le salaire d'un employé.
	 * @return Le salaire d'un employé
	 */
	public abstract double salaire();
}
