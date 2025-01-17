package tp6.ex10;

public class LivreEmpruntable
{
    private String titre;
    private boolean disponible = true;
    
    public LivreEmpruntable(String nom)
    {
        this.titre = nom;
    }
    
    public void emprunter()
    {
        if (this.disponible) 
        {
            this.disponible = false;
            System.out.println("Le livre \"" + this.titre + "\" a été emprunté.");
        }
        else
        {
            System.out.println("Le livre \"" + this.titre + "\" est déjà emprunté.");
        }
    }
    
    public void rendre()
    {
        if (!this.disponible) 
        {
            this.disponible = true;
            System.out.println("Le livre \"" + this.titre + "\" a été rendu.");
        }
        else
        {
            System.out.println("Le livre \"" + this.titre + "\" n'était pas emprunté, vous ne pouvez donc pas le rendre.");
        }
    }
    
    public void afficherStatut()
    {
        String intercalaire = this.disponible ? "est disponible !" : "n'est pas disponible !";
        System.out.println("Le livre \"" + this.titre + "\" " + intercalaire);
    }
}
