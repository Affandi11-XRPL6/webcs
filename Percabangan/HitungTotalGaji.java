import java.util.Scanner;

public class HitungTotalGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


         System.out.print ("Masukkan Nama Karyawan : ");
         String Nama = input.nextLine();
        System.out.print("Masukkan masa kerja karyawan (dalam tahun): ");
        double masaKerja = input.nextDouble();

        double gajiPokok = 3000000;
        double bonus;

        if (masaKerja > 3) {
            bonus = 0.10 * gajiPokok;
        } else {
            bonus = 0.05 * gajiPokok;
        }

        double totalGaji = gajiPokok + bonus;

        System.out.println("Nama Karyawan : " + Nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Bonus: Rp " + bonus);
        System.out.println("Total Gaji: Rp " + totalGaji);

        input.close();
    }
}
