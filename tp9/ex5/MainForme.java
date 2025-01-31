package tp9.ex5;

public class MainForme {
    public static void main(String[] args) {
        Forme r = new Rectangle(5, 3);
        Forme c = new Cercle(4);

        r.afficherInfos(); // Affiche : Rectangle - Longueur : 5.0, Largeur : 3.0
        r.afficherAire();  // Affiche : L'aire est : 15.0

        c.afficherInfos(); // Affiche : Cercle - Rayon : 4.0
        c.afficherAire();  // Affiche : L'aire est : 50.26548245743669
    }
}
