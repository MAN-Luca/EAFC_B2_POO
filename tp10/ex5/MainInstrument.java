package tp10.ex5;

public class MainInstrument
{	
    public static void main(String[] args) {

    	Instrument[] orchestre = {
                new Guitare(),
                new Piano(),
                new Instrument() // Juste pour voir l'effet du polymorphisme
            };

        for (Instrument instrument : orchestre) {
            instrument.jouer();
        }
    }
}
