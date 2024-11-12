package tp1;

public class EX10 {

    public static void main(String[] args) {
        double p = 78.0; 
        double t = 1.78;  


        double imc = p / (t * t);


        System.out.println("Poids = " + p + " kg");
        System.out.println("Taille = " + t + " m");
        System.out.println("IMC = " + String.format("%.2f", imc));
    }
}
