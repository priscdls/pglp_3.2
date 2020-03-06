package Priscille_DAOULAS.pglp_3_2;
/**
 * Classe Vendeur héritant de la classe Salaire.
 *
 */
public class Vendeur extends Salaire {
	/**
	 * La commission d'un vendeur qui s'ajoute a son salaire de base.
	 */
	private int commission;
	/**
	 * Constructeur.
	 * @param commission La commission d'un vendeur qui s'ajoute a son salaire de base.
	 */
	public Vendeur(int commission) {
		super(1500);
		this.commission = commission;
	}
	/**
	 * Fonction calculant le salaire d'un vendeur en fonction de sa commission.
	 */
	@Override
	public double salaire(){
		return base + commission;
	}
}
