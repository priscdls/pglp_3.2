package Priscille_DAOULAS.pglp_3_2;

/**
 * Classe représentant la base de salaire d'un employé, manager,vendeur.
 */
public abstract class Salaire {
    /**
     * Salaire de base.
     */
    private final int base;
    /**
     * Constructeur.
     * @param b Salaire de base
     */
    public Salaire(final int b) {
        this.base = b;
    }
    /**
     * Getteur de base.
     * @return Le salaire de base
     */
    public int getBase() {
        return base;
    }
    /**
     * Fonction calculant le salaire d'un employé.
     * @return Le salaire d'un employé
     */
    public abstract double salaire();
}
