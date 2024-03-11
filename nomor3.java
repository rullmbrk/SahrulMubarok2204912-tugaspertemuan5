/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soallatihanpert5;

/**
 *
 * @author sahru
 */
import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bilangan pertama: ");
        int a = input.nextInt();

        System.out.print("bilangan kedua: ");
        int b = input.nextInt();

        int fpb = hitungFPB(a, b);

        System.out.println("Faktor Pembagi Terbesar dari " + a + " dan " + b + " adalah: " + fpb);
    }

    public static int hitungFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
