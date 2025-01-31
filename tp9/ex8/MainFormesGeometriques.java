package tp9.ex8;

public class MainFormesGeometriques
{

	public static void main(String[] args)
	{
		Forme carre = new Carre(4);
		Forme triangle = new Triangle(4, 2);
		Forme cercle = new Cercle(5);
		
		carre.afficherInfos();
		carre.afficherAire();
		
		triangle.afficherInfos();
		triangle.afficherAire();
		
		cercle.afficherInfos();
		cercle.afficherAire();
	}

}
