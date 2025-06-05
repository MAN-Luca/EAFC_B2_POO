package revisionEX5;

// Interface pour définir un contrat d’authentification
public interface Authentifiable 
{
    boolean seConnecter(String email, String motDePasse); // Méthode à implémenter pour vérifier les identifiants
}
