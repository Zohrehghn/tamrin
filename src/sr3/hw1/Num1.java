package sr3.hw1;

public class Num1 {

    public static void main(String[] args) {

        long a = 1;
        for (int i = 0; i <= 32; i++) {
            System.out.printf("2^%d = %d \n", i, a);
            a *= 2;
        }//for
    }

}
