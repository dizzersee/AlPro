package blatt1;

public class B1A4 {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);

        System.out.println("Sum: " + sum(input));
        System.out.println("Sum quad: " + sumQuadrat(input));

    }

    private static int sum(int n) {
        return (n * n^2) / 2;
    }

    private static int sumQuadrat(int n) {
        return (n*(n+1)*(2*n+1))/6;
    }

}
