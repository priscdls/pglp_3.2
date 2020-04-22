package priscille.pglp_3_2;
/**
 * Classe Vendeur héritant de la classe Salaire.
 *
 */
public class Vendeur extends Salaire {
    /**
     * La commission d'un vendeur qui s'ajoute a son salaire de base.
     */
    private final int commission;
    /**
     * Constructeur.
     * @param com La commission d'un vendeur
     * qui s'ajoute a son salaire de base.
     */
    public Vendeur(final int com) {
        super(1500);
        this.commission = com;
    }
    /**
     * Fonction calculant le salaire d'un vendeur
     * en fonction de sa commission.
     * @return Le salaire d'un vendeur
     */
    @Override
    public double salaire() {
        return getBase() + commission;
    }
}
