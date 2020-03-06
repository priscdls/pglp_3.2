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
	 * @param nbEmployes Nombre d'employé à sa charge
	 */
	public Manager(int nbEmployes) {
		super(1500);
		this.nbEmployes=nbEmployes;
	}
	@Override
	/**
	 * Fonction calculant le salaire d'un manager en fonction du nombre d'employé a sa charge.
	 * @return Le salaire d'un manager.
	 */
	public double salaire() {
		return base + (nbEmployes * 100);
	}
}

