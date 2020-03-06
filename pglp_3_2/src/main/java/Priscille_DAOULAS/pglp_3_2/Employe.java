package Priscille_DAOULAS.pglp_3_2;

/**
 * Classe Employe héritant de la classe Salaire.
 *
 */
public class Employe extends Salaire {
	/**
	 * Année où l'employé à été embauché.
	 */
	private final int startYear;
	/**
	 * Constructeur.
	 * @param startYear Année où l'employé à été embauché
	 */
	public Employe(int startYear) {
		super(1500);
		this.startYear = startYear;
	}
	/**
	 * Fonction calculant le salaire d'un employé en fonction de son ancienneté.
	 */
	@Override
	public double salaire() {
		return base + (2020 - this.startYear) * 20;
	}
}

