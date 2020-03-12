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
    * Année actuelle.
    */
    private final int anneeActuelle = 2020;
    /**
     * Multiplicateur de salaire
     * en fonction de l'ancienneté.
     */
    private final int multAncien = 20;
    /**
     * Constructeur.
     * @param start Année où l'employé à été embauché
     */
    public Employe(final int start) {
        super(1500);
        this.startYear = start;
    }
    /**
     * Fonction calculant le salaire d'un employé.
     * en fonction de son ancienneté.
     */
    @Override
    public double salaire() {
        return getBase() + (anneeActuelle - this.startYear) * multAncien;
    }
}

