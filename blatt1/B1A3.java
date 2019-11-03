package blatt1;

public class B1A3 {

    public static void main(String[] args) {
        int a = 15;
        int b = 34;
        int c = 1;

        // 1. Normaler Vergleich
        System.out.println("1: " + (a == b));


        // 2. Minus wird vor dem Vergleich ausgeführt
        System.out.println("2: " + (a == b - 19));

        // XOR-Operation (Jedes Bit gexort)
        System.out.println("3: " + (a ^ b));

        // Gleich, da Inkrementiert erst nach der Ausführung
        System.out.println("4: " + (a++ ^ b));

        // Inkrementiert vor der Ausführung. 7 wird 2 Mal nach links geshiftet
        // 0111 --> 11100
        System.out.println("5: " + (7 << ++c));

        // 0x10 ist hex; Ausführung von rechts, letzter Wert wird ausgegeben
        System.out.println("6: " + (a = b = c = 0x10));

        // Exponentialschreibweise: 1 * 10^1
        System.out.println("7: " + (1e1));
    }
}

