import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 8");

        System.out.println("Aufgabe 1");
        int[] zahl1 = new int[3];
        for (int i = 0; i < zahl1.length; i++) {
            zahl1[i] = i + 1;
        }
        double[] zahl2 = {1.57, 7.654, 9.986};
        byte[] zahl3 = {20, 30};

        System.out.println("Aufgabe 2");
        for (int i = 0; i < zahl1.length; i++) {
            if (i == zahl1.length - 1) {
                System.out.println(zahl1[i]);
                break;
            }
            System.out.print(zahl1[i] + ", ");
        }
        for (int i = 0; i < zahl2.length; i++) {
            if (i == zahl2.length - 1) {
                System.out.println(zahl2[i]);
                break;
            }
            System.out.print(zahl2[i] + ", ");
        }
        for (int i = 0; i < zahl3.length; i++) {
            if (i == zahl3.length - 1) {
                System.out.println(zahl3[i]);
                break;
            }
            System.out.print(zahl3[i] + ", ");
        }
        System.out.println("Aufgabe 3");

        for (int i = zahl1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(zahl1[i]);
                break;
            }
            System.out.print(zahl1[i] + ", ");
        }
        for (int i = zahl2.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(zahl2[i]);
                break;
            }
            System.out.print(zahl2[i] + ", ");
        }
        for (int i = zahl3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(zahl3[i]);
                break;
            }
            System.out.print(zahl3[i] + ", ");
        }
        System.out.println("Aufgabe 4");
        for (int i = 0; i < zahl1.length ; i++) {
            if (zahl1[i] % 2 == 1){
                zahl1[i]++;
            }
        }
        System.out.println(Arrays.toString(zahl1));
    }
}