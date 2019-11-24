package blatt4;

public class B4A3 {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int n = sc.nextInt(); // liest eine Ganzzahl (int) ein


        if(n == 0) {
            System.out.println("null");
            return;
        }

        int mil = n / 1000000;
        if(mil > 0) {
            printUntil999(mil);
            System.out.print(" Millionen ");
        }

        int thd = (n % 1000000) / 1000;
        if(thd > 0) {
            printUntil999(thd);
            System.out.print(" Tausend ");
        }

        int k = (n % 1000);
        printUntil999(k);
    }

    public static void printUntil999(int n) {
        int hundert = n / 100;
        if(hundert > 0) {
            printUntil10(hundert);
            System.out.print(" Hundert ");
        }
        printUntil99(n % 100);
    }

    public static void printUntil99(int n) {
        if(n < 10) printUntil10(n);
        else if(n == 10) System.out.print(" zehn ");
        else if(n == 11)  System.out.print(" elf ");
        else if(n == 12) System.out.print(" zwölf ");
        else if(n < 19) {
            printUntil10(n);
            System.out.println(" zehn ");
        } else {
            if(n % 10 != 0) {
                printUntil10(n % 10);
                System.out.print(" und ");
            }

            if(n / 10 == 2) System.out.print(" zwanzig ");
            if(n / 10 == 3) System.out.print(" dreißig ");
            if(n / 10 == 4) System.out.print(" vierzieg ");
            if(n / 10 == 5) System.out.print(" fünfzig ");
            if(n / 10 == 6) System.out.print(" sechzig ");
            if(n / 10 == 7) System.out.print(" siebzig ");
            if(n / 10 == 8) System.out.print(" achzig ");
            if(n / 10 == 9) System.out.print(" neunzig ");

        }
    }

    public static void printUntil10(int n) {
        switch(n) {
            case 1:
                System.out.print(" eins ");
                break;
            case 2:
                System.out.print(" zwei ");
                break;
            case 3:
                System.out.print(" drei ");
                break;
            case 4:
                System.out.print(" vier ");
                break;
            case 5:
                System.out.print(" fünf ");
                break;
            case 6:
                System.out.print(" sechs ");
                break;
            case 7:
                System.out.print(" sieben ");
                break;
            case 8:
                System.out.print(" acht ");
                break;
            case 9:
                System.out.print(" neun ");
                break;
        }
    }
}
