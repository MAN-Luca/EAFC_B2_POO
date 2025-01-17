package tp6.ex4;

public class Livre {
	private String titre;
	private String auteur;
	private double prix;
	private int quantite;
	
	public Livre(String titre, String auteur, double prix, int quantite) {
		this.titre = titre;
		this.auteur = auteur;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public void vendre(int q) {
		if (this.quantite <= 1) {
			System.out.println("ERREUR : Le livre n'est plus disponible");
		} else {
			this.quantite -= q;
			String intercalaire = this.quantite == 1 ? "livre à été retiré" : " livres ont étés retirés";
			System.out.println(q + intercalaire + "\n\tIl reste " + this.quantite + " livres");
		}
	}
	public void approvisionner(int q) {
		this.quantite += q;
		System.out.println(q + " éxemplaires ont été ajoutés");
	}
	
	public void afficher() {
		System.out.println("Livre : " + this.titre + "\n\tAuteur : " + this.auteur + "\n\tPrix : " + this.prix + "\n\tQuantité : " + this.quantite);
	}
}
