package blatt2;

enum NUMBER_STATUS
{
    PERFECT, DEFICIENT, ABUDANT;
}

public class B2A3 {
    public static void main(String[] args) {
        a3();

    }
    private static void a3() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int n = sc.nextInt();

        abTest(n, true);
        c(n);
        d(n);
        sc.close();

        /*
        14: deficient
        18: abundant
        25: deficient
        28: perfect
        51: deficient
        499: deficient
         */
    }

    private static void d(int n) {
        int cnt = 0;
        for(int i = 1; i < n; i++) {
            if(abTest(i, false) ==  NUMBER_STATUS.DEFICIENT) {
                cnt++;
            }
        }
        System.out.printf("Anzahl defizienter Zahlen bis %d: %d\n", n, cnt);
    }

    private static void c(int n) {
        System.out.printf("Vollkommene Zahlen bis %d:\n", n);
        for(int i = 1; i < n; i++) {
            if(abTest(i, false) ==  NUMBER_STATUS.PERFECT) {
                System.out.printf("Die Zahl %d ist vollkommen.\n", i);
            }
        }
        System.out.println("\n\n");
    }

    /**
     * Liefere ob n vollkommen, defizient oder abundant ist
     * Gebe aus ob n vollkommen oder defizient
     * @param n
     * @return
     */
    private static NUMBER_STATUS abTest(int n, boolean print) {
        int sum = 0;
        for(int i  = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        if(sum == n) {
            if(print)
                System.out.printf("Die Zahl %d ist vollkommen\n", n);
            return NUMBER_STATUS.PERFECT;
        }

        if(sum < n) {
            if(print)
                System.out.printf("Die Zahl %d ist defizient\n", n);
            return NUMBER_STATUS.DEFICIENT;
        }

        System.out.printf("Die Zahl %d ist abundant\n", n);

        return NUMBER_STATUS.ABUDANT;
    }
}
