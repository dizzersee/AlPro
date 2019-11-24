package blatt4;

import java.util.Random;

public class B4A4 {

    public static void main(String[] args) {



        Random rand = new Random();

        // nextInt as provided by Random is exclusive of the top value so you need to add 1

        int max = 100;
        int min = 0;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(randomNum);

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Eingabe: ");
        int input = sc.nextInt(); // liest eine Ganzzahl (int) ein

        if(input < randomNum)
            return;

        int dif = input - randomNum;

        System.out.println("dif = " + dif);;

        int[] arr = {50,20,10,5,2,1};

        int i = 0;
        while(dif != 0) {
            int coin = arr[i];
            if(dif >= coin) {
                System.out.println(coin);
                dif -= coin;
            } else {
                i++;
            }
        }
    }
}
