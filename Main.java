package pract1_java;

public class Main
{
    public static void main(String[] args) {

        int s = 0;
        int[] mass = new int[] {1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            s += mass[i];
        }
        System.out.println(s);

        int i2 = 0;
        int s2 = 0;
        while (i2 < 4) {
            s2 += mass[i2];
            i2++;
        }
        System.out.println(s2);

        int i3 = 0;
        int s3 = 0;
        do{
            s3 += mass[i3];
            i3++;
        }while (i3 < 4);
        System.out.println(s3);
    }
}