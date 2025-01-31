package tp9.ex5;

public abstract class Forme {
	
    public abstract double calculerAire();
    
    public abstract void afficherInfos();

    public void afficherAire() {
        System.out.println("L'aire est : " + calculerAire());
    }
}
