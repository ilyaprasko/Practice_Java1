package pract1_java;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {



        int a = 0;
        int b = 100;
        int[] mass = new int[10];
        for (int i = 0; i < 10; i++) {
            int rn1 = a + (int) (Math.random() * b);
            mass[i] = rn1;
            System.out.print(mass[i] + " ");
        }
        Arrays.sort(mass);
        System.out.print(" | " + Arrays.toString(mass));

    }
}
