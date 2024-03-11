/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soallatihanpert5;

/**
 *
 * @author sahru
 */
import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nilai N: ");
        int N = input.nextInt();
        input.nextLine();

        for (int i = 0; i < N; i++) {
            tuliskalimat();
        }
    }

    public static void tuliskalimat() {
        System.out.println("Saya senang belajar bahasa Java");
    }
}
