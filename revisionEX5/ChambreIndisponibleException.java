package revisionEX5;

// Exception personnalisée pour les chambres non disponibles
public class ChambreIndisponibleException extends Exception {
    public ChambreIndisponibleException(String message) {
        super(message); // Appel du constructeur parent avec un message
    }
}
