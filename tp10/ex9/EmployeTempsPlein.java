package tp10.ex9;

public class EmployeTempsPlein extends Employe 
{
    private double salaireFixe;

    public EmployeTempsPlein(double salaireFixe) 
    {
        this.salaireFixe = salaireFixe;
    }

    @Override
    public double calculerSalaire() 
    {
        return salaireFixe;
    }
}
