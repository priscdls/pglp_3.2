package priscille.pglp_3_2;

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
     * @param start Année où l'employé à été embauché
     */
    public Employe(final int start) {
        super(1500);
        this.startYear = start;
    }
    /**
     * Fonction calculant le salaire d'un employé.
     * en fonction de son ancienneté.
     * @throws Exception
     */
    @Override
    public double salaire() throws Exception {
        final int anneeActuelle = 2020;
        final int multAncien = 20;
        if (startYear > anneeActuelle) {
            throw new Exception();
        }
        return getBase() + (anneeActuelle - this.startYear) * multAncien;
    }
}

