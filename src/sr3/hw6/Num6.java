package sr3.hw6;

import java.util.Scanner;

public class Num6 {

    public static void main(String[] args) {
        int sum = 0;
        double avg = 0.0D;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter count of your number! \n");
        int n = input.nextInt();
        int min = 0;
        int max = 0;
        int a;
        if (n == 1) {
            System.out.println("please enter your mark: \n");
            a = input.nextInt();
            avg = (double)a;
            System.out.printf("Min is : %d , max is %d .. and average is %.2f", a, a, avg);
            System.out.println(avg);
        } else {
            System.out.println("please enter two marks:");
            a = input.nextInt();
            int c = input.nextInt();
            sum = a + c;
            if (a <= c) {
                min = a;
                max = c;
            } else {
                max = a;
                min = c;
            }

            for(int i = 0; i < n - 2; ++i) {
                System.out.println("please enter other marks:");
                int b = input.nextInt();
                sum += b;
                if (b >= max) {
                    max = b;
                }

                if (b <= min) {
                    min = b;
                }
            }

            avg = (double)sum / (double)n;
            System.out.format("Min is : %d , max is %d ..... and avg is : %.2f\n ", min, max, avg);
            System.out.println(avg);
        }

    }


}
