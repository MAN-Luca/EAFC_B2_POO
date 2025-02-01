package tp10.ex9;

public class MainEmployesPoly
{

	public static void main(String[] args) {
        // Création d'un tableau d'employés avec polymorphisme
        Employe[] employes = {
            new EmployeTempsPlein(3000),
            new EmployeTempsPartiel(20, 80)
        };

        // Affichage des salaires
        for (Employe employe : employes) {
            System.out.println("Salaire : " + employe.calculerSalaire() + "€");
        }
    }

}
