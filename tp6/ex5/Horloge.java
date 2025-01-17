package tp6.ex5;

public class Horloge
{
	private int heures;
	private int minutes;
	private int secondes;
	private int t_en_s = 0;	// pour les conversions
	
	public Horloge(int h, int m, int s) 
	{
        if (isTimeValid(h, m, s)) 
        {
            this.heures = h;
            this.minutes = m;
            this.secondes = s;
            this.t_en_s = this.heures * 3600 + this.minutes * 60 + this.secondes;
        } 
        else 
        {
            throw new IllegalArgumentException("Temps invalide !");
        }
    }
	
	private boolean isTimeValid(int h, int m, int s) 
	{
        return h >= 0 && h < 24 && m >= 0 && m < 60 && s >= 0 && s < 60;
    }
	
	public void convert_second_in_time(int tot_sec) 
	{
	    this.heures = (tot_sec / 3600) % 24;	// Modulo 24 pour revenir à 0 si on dépasse
	    int reste = tot_sec % 3600;
	    this.minutes = reste / 60;            
	    this.secondes = reste % 60;           
	}
	
	public void ajouter_secondes(int secondesAjoutees)
	{
	    int heuresAjoutees = secondesAjoutees / 3600;
	    int reste = secondesAjoutees % 3600;
	    int minutesAjoutees = reste / 60;
	    int secondesRestantes = reste % 60;
	    
		this.t_en_s += secondesAjoutees;
		this.convert_second_in_time(t_en_s);
		System.out.printf("%d secondes ajoutées, soit %02dh:%02dm:%02dm \n", secondesAjoutees, heuresAjoutees, minutesAjoutees, secondesRestantes);
	}
	
	public void afficher_temps()
	{
		System.out.printf("Heure actuelle : %02d:%02d:%02d\n", this.heures, this.minutes, this.secondes);
	}
}
