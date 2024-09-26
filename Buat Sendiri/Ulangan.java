import java.util.Scanner;

public class Ulangan { 
    public static void main(String[] args) {

    String Nama;
    int GajiPokok, TunjanganPasangan,TunjanganAnak, ZakatProfesi, GajiTotal;

        GajiPokok = 2800000;
        TunjanganPasangan = 200000;
        ZakatProfesi = 250000;

        System.out.println("Masukkan Nama pegawai : ");
        Scanner input = new Scanner(System.in);
        Nama = input.nextLine();
        
        System.out.println("Apakah Anda Memiliki Istri/Suami : (Ketik 1 Jika punya | Ketik 2 Jika Tidak) ");
        int Pasangan = input.nextInt();

        switch (Pasangan){

        case 1:
        System.out.println("Punya");

         System.out.println("Input Jumlah Anak : ");
        int JumlahAnak = input.nextInt();
        TunjanganAnak = 100000;
        int Tunjangan = JumlahAnak * TunjanganAnak;
         GajiTotal = GajiPokok + Tunjangan + TunjanganPasangan - ZakatProfesi;
        System.out.println("Nama : " + Nama);
        System.out.println("Total Gaji Anda Adalah : Rp. " + GajiTotal);
        System.out.println("Dengan Rincian :" );
        System.out.println("Gaji Pokok : Rp. "+ GajiPokok +
         " + Tunjangan Pasangan : Rp. " + TunjanganPasangan + " + Tunjangan Anak (100.000/Anak) : Rp. "
          + Tunjangan + " - Zakat Profesi : Rp. " + ZakatProfesi + " = Rp." + GajiTotal);
          break;

        case 2:
        System.out.println("Tidak Punya");

        System.out.println("Nama : " + Nama);
        GajiTotal = GajiPokok - ZakatProfesi;
        System.out.println("Total Gaji Anda Adalah : Rp. " + GajiTotal);
        System.out.println("Dengan Rincian :" );
        System.out.println("Gaji Pokok : Rp. "+ GajiPokok + " - Zakat Profesi : Rp. " + ZakatProfesi + " = Rp." + GajiTotal);
        
        break;

        default: 
        System.out.println("Maaf Mungkin System Butuh Perbaikan");
        }
    } 
}