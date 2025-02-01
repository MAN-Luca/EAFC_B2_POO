package tp10.ex8;

public class MainFormes
{

	public static void main(String[] args) {
        // Initialisation d'un tableau de Forme avec un Rectangle et un Cercle
        Forme[] formes = {
            new Rectangle(5, 10),
            new Cercle(7)
        };

        // Affichage des aires
        for (Forme forme : formes) {
            System.out.println("Aire : " + forme.calculerAire());
        }
    }

}
