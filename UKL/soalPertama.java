package UKL;

import java.util.Scanner;

public class soalPertama {
    public static void main(String[] args) {

        // Scanner scn = new Scanner(System.in);

        // double Volume, panjang, lebar, tinggi, harga, berat, jarak;

        // System.out.println("Input panjang paket : (cm)");
        // panjang = scn.nextDouble();

        // System.out.println("Input Lebar paket : (cm)");
        // lebar = scn.nextDouble();

        // System.out.println("Input Tinggi paket : (cm)");
        // tinggi = scn.nextDouble();

        // Volume = (panjang * lebar * tinggi);
        // System.out.println("Volume paket : " + Volume + "cm^3");

        // System.out.println("Input jarak : " + "(km)");
        // jarak = scn.nextDouble();
        
        // System.out.println("Masukan Berat Paket : " + "(kg)");
        // berat = scn.nextDouble();

        // double biayaperkg;
        // if (jarak <= 10){
        //     biayaperkg = 4250;
        //  } else {
        //     biayaperkg = 6000;
        // }
        
        // double hargaberat = (berat * biayaperkg);
        // double hargavolume;
        // if (Volume > 100){
        //     hargavolume = 50000;
        // } else {hargavolume = 0;}

        
        // double totalharga = hargaberat + hargavolume;
        // System.out.println("Harga total : Rp. " + totalharga);


        Scanner scn = new Scanner(System.in);

        System.out.println("Input Angka : ");
        int angka = scn.nextInt();

        if (angka % 2 == 0) { 
            System.out.println(angka + " adalah angka Genap");
        } else {
            System.out.println(angka + " adalah angka Ganjil");
        }
    }
}