package sr3.hw4;

import java.util.Scanner;

public class Num4 {

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

        for (int z = n - 1; z > 0; z--) {
            for (int x = n; x > z; x--) {
                System.out.print(" ");
            }// for x
            for (int c = 2 * z - 1; c > 0; c--) {
                System.out.print("*");
            } //for c
            System.out.println("");
        }// for z
    } //main

}
