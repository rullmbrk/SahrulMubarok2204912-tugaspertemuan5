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

public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" batas awal: ");
        int batasAwal = input.nextInt();

        System.out.print(" batas akhir: ");
        int batasAkhir = input.nextInt();

        int jumlahDeretGenap = hitungJumlahDeretGenap(batasAwal, batasAkhir);

        System.out.println("Jumlah deret bilangan genap antara " + batasAwal + " dan " + batasAkhir + " adalah: " + jumlahDeretGenap);
    }

    public static int hitungJumlahDeretGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) {
                jumlah += i;
            }
        }
        return jumlah;
    }
}
