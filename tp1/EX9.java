package tp1;

public class EX9 {

    public static void main(String[] args) {
        double rayon = 6;
        double circ = 2 * Math.PI * rayon;
        double aire = Math.PI * (rayon * rayon);

        System.out.println("Périmètre: " + String.format("%.2f", circ));
        System.out.println("Aire: " + String.format("%.2f", aire));
    }
}
