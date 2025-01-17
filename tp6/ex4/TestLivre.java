package tp6.ex4;

public class TestLivre {

	public static void main(String[] args) {
		Livre l = new Livre("La Bible", "Les Apôtres", 10, 1);
		
		l.vendre(3);
		l.approvisionner(10);
		l.vendre(3);
		l.afficher();
	}

}
