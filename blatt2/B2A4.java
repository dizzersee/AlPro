package blatt2;

public class B2A4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe n: ");
        int n = sc.nextInt();
        System.out.println("Eingabe k: ");
        int k = sc.nextInt();
        sc.close();
        int pow = powRec(n, k);
        System.out.println("---\n");
        int pow2 = powRec2(n, k);
        System.out.println("pow1 = " + pow);
        System.out.println("pow2 = " + pow2);
    }

    private static int powRec(int a, int n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return a;
        return a * powRec(a, n -1);
    }

    private static int powRec2(int a, double n) {
        if(n == 0)
            return 1;
        if(n % 2 == 0)
            return powRec2(a, n/2) * powRec2(a, n/2);

        return a * powRec2(a, (n-1)/2) * powRec2(a, (n-1)/2);
    }



}
