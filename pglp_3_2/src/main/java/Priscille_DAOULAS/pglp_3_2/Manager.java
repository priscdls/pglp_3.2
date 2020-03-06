package Priscille_DAOULAS.pglp_3_2;
/**
 * Classe Manager héritant de la classe Salaire.
 *
 */
public class Manager extends Salaire {
	/**
	 * Nombre d'employé à sa charge.
	 */
	private final int nbEmployes;
	/**
	 * Constructeur.
	 * @param nbEmp Nombre d'employé à sa charge
	 */
	public Manager(final int nbEmp) {
		super(1500);
		this.nbEmployes = nbEmp;
	}
	/**
	 * Fonction calculant le salaire d'un manager en fonction du nombre d'employé a sa charge.
	 * @return Le salaire d'un manager.
	 */
	@Override
	public double salaire() {
		return base + (nbEmployes * 100);
	}
}

