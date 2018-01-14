package sr3.hw3;

import java.util.Scanner;

public class Num3 {

    public static void main(String[] args) {
        System.out.println("Please enter high of your traingle! ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }//i
    } //main

}
