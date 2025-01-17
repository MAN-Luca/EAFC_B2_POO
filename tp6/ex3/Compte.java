package tp6.ex3;

public class Compte {
	private String titulaire;
	private double solde = 0;
	
	public Compte(String nom, double solde) {
		this.titulaire = nom;
		this.solde = solde;
	}
	public Compte(String nom) {
		this.titulaire = nom;
	}
	
	public void deposer(double val) {
		this.solde += val;
		System.out.println("Dépôt de : " + val + "€");
	}
	
	public void retirer(double val) {
		this.solde -= val;
		System.out.println("Retrait de : " + val + "€");
	}
	
	public void afficherSolde() {
		System.out.println("Compte de : " + this.titulaire + "\n\tSolde : " + this.solde);
	}
}	

