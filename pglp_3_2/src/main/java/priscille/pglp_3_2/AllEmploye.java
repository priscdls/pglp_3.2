package priscille.pglp_3_2;

import java.util.ArrayList;
/**
 * Classe ayant la liste de tous les employés.
 *
 */
public class AllEmploye {
    /**
     * Liste des employés.
     */
    private ArrayList<Salaire> listEmploye;
    /**
     * Constructeur.
     */
    public AllEmploye() {
        listEmploye = new ArrayList<Salaire>();
    }
    /**
     * Une fonction qui ajoute un employé a la liste des employés.
     * @param s L'employé a ajouter.
     */
    public void ajoutEmploye(final Salaire s) {
        if (!listEmploye.contains(s)) {
            listEmploye.add(s);
        }
    }
    /**
     * Une fonction qui retire un employé a la liste des employés.
     * @param s L'employé a retirer.
     */
    public void retireEmploye(final Salaire s) {
        if (listEmploye.contains(s)) {
            listEmploye.remove(s);
            }
    }
    /**
     * Une fonction qui calcule la somme des salaires des employés.
     * @return La somme des salaires des employés
     * @throws Exception
     */
    public double totalSalaire() throws Exception {
        double totalSalaire = 0.0;
        for (Salaire s : listEmploye) {
            totalSalaire += s.salaire();
        }
        return totalSalaire;
    }
}
