import java.util.Scanner;

public class KasirRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Nama;
        int Burger = 12000;
        int Pizza = 25000;
        int Soda = 5000;
        int Kentucky = 15000;
        int FrenchFries = 10000;

        System.out.println("Masukkan Nama Pembeli : ");
        Nama = input.nextLine();

        int HargaTotal = 0; 

        do {
            System.out.println("Input Makanan yang di pesan ");
            System.out.println("____________________________");
            System.out.println("Masukkan Jumlah Burger ");
            int JumlahBurger = input.nextInt();
            HargaTotal += JumlahBurger * Burger;

            System.out.println("Masukkan Jumlah Pizza ");
            int JumlahPizza = input.nextInt();
            HargaTotal += JumlahPizza * Pizza;

            System.out.println("Masukkan Jumlah Soda ");
            int JumlahSoda = input.nextInt();
            HargaTotal += JumlahSoda * Soda;

            System.out.println("Masukkan Jumlah Kentucky ");
            int JumlahKentucky = input.nextInt();
            HargaTotal += JumlahKentucky * Kentucky;

            System.out.println("Masukkan Jumlah FrenchFries");
            int JumlahFrenchFries = input.nextInt();
            HargaTotal += JumlahFrenchFries * FrenchFries;

            System.out.println("Total Harga Anda ");
            System.out.println(HargaTotal);

            System.out.println("Apakah Anda ingin memesan lagi? (Ketik R untuk memesan lagi atau N untuk selesai)");
            String pesanLagi = input.next();
            
            
            input.nextLine();

            if (!pesanLagi.equalsIgnoreCase("R")) {
                break; 
            }

        } while (true);

        System.out.println("Masukkan Pembayaran : Rp. ");
        int Bayar = input.nextInt();

        if (Bayar == HargaTotal) {
            System.out.println("Uang Pas");
        } else if (Bayar > HargaTotal) {
            int Kembalian = Bayar - HargaTotal;
            System.out.println("Kembalian Anda : Rp. " + Kembalian);
        } else if (Bayar < HargaTotal) {
            int Kurang = HargaTotal - Bayar;
            System.out.println("Maaf Uang Anda Kurang : Rp. " + Kurang);
        } else {
            System.out.println("Mohon Maaf Mungkin Program Sedang Error, Hubungi Programmer / Kunjungi www.chatGPT.com :( ");
        }
    }
}
