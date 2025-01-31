package tp9.ex3;

public abstract class Animal
{
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode abstraite
    public abstract void parler();

    // Méthode concrète
    public void manger() {
        System.out.println("L'animal mange");
    }
}



