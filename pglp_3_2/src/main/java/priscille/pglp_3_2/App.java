package priscille.pglp_3_2;
/**
 * Classe App.
 */
public final class App {
    /**
     * Constructeur.
     */
    private App() {
    }
    /**
     * Début du programme.
     * @param args Les arguments donnés au démarrage de l'application
     */
    public static void main(final String[] args) {
        AllEmploye e = new AllEmploye();
        final int com = 100;
        final int annee = 2005;
        final int nbEmp = 20;
        e.ajoutEmploye(new Vendeur(com));
        e.ajoutEmploye(new Employe(annee));
        e.ajoutEmploye(new Manager(nbEmp));
    }
}
