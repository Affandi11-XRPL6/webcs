import java.util.Scanner;
public class ProgramDiskon {
    public static void main(String[] args) {

    double Bukutulis = 2500;
    double Pensil = 1000;
    double Penghapus = 1500;
    double Penggaris = 1000; 

Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Jumlah beli Buku Tulis");
    double JumlahBuku= input.nextDouble();
    double total=JumlahBuku*Bukutulis;

      System.out.println("Masukkan Jumlah beli pensil");
    double JumlahPensil= input.nextDouble();
    total += JumlahPensil*Pensil;

      System.out.println("Masukkan Jumlah beli penghapus");
    double JumlahPenghapus= input.nextDouble();
    total += JumlahPenghapus*Penghapus;

    System.out.println("Masukkan Jumlah beli penggaris");
    double JumlahPenggaris= input.nextDouble();
    total += JumlahPenggaris*Penggaris;

System.out.println("Masukan Pembayaran : ");
    double bayar=input.nextDouble();
    double diskon= bayar*0.05;
    double kembali=bayar-(total*diskon);

System.out.println("Total diskon: "+diskon);
System.out.println("Total kembalian: "+kembali);

    }
}