package tp9.ex3;

public class Chien extends Animal	// Héritage
{
    public Chien(String nom, int age) {
        super(nom, age);
    }

    // Implémentation de la méthode parler()
    @Override	// Overide car on implémente la méthode abstraite parler de la classe mère animal
    public void parler() {
        System.out.println("Le chien aboie");
    }
}

