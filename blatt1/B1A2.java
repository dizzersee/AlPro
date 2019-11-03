package blatt1;

public class B1A2 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");

        int k = sc.nextInt(); // liest eine Ganzzahl

        (int) ein System.out.println(++k);   // Ausgabe a)

        System.out.println(k); // Ausgabe b)

        System.out.println(k++);  // Ausgabe c)
        int k2 = 5;

        double result = k2 / 2; // Stelle 1

        // Mögliche Verbesserungen: Eins muss double sein

        double result2 = (double) k2 / 2;
        double result3 = k2 / 2d;
        double result4 = k2 / (double) 2;

        System.out.println("5 / 2 = " + result); // Ausgabe d)


        boolean b = false;

        if (b = false) {
            System.out.println("b ist falsch."); // Ausgabe e) 
        } else { 
            System.out.println("b ist wahr."); // Ausgabe f) }
        }
    }
}
