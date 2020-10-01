package pract1_java;

public class Main4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int fak = 1;
        int rn = a + (int) (Math.random() * b);
        System.out.println(rn + " ");

        for(int i = 1; i <= rn; i++){
            fak *= i;
        }
        System.out.print(fak);
    }
}
