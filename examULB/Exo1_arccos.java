package examULB;

import java.util.Scanner;

public class Exo1_arccos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, result;

        // Saisie sécurisée entre -1 et 1
        do {
            System.out.print("Arccos de ? (entre -1 et 1) : ");
            x = input.nextDouble();
        } while (x < -1 || x > 1);

        result = arccos(x);

        System.out.printf("arccos(%.2f) = %.4f rad = %.4f°%n", x, result, toDeg(result));
        input.close();
    }

    public static double arccos(double x) {
        final double EPS = 1.0e-5;
        final long N_MAX = 50;

        double res = Math.PI / 2 - x;
        double c_i = -0.5;
        int i = 1;

        double terme = c_i * (Math.pow(x, 2 * i + 1) / (2 * i + 1));

        while (Math.abs(terme) >= EPS && i <= N_MAX) {
            res += terme; 
            c_i *= (double) (2 * i - 1) / (2 * i); 
            i++;
            terme = c_i * (Math.pow(x, 2 * i + 1) / (2 * i + 1));
        }

        return res + terme;
    }

    public static double toDeg(double x) {
        return x * (180 / Math.PI);
    }
}
