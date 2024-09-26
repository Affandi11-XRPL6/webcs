import java.util.Scanner;

public class BayarSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NamaMahaSiswa, Jalurmasuk;
        int Pendapatan, SPP, DSP, TotalBayar, Bulan;

        System.out.println("Masukkan Nama MahaSiswa: ");
        NamaMahaSiswa = input.nextLine();
        System.out.println("Masukkan Besar Pendapatan Orang Tua: ");
        Pendapatan = input.nextInt();
        System.out.println("Masukkan Jumlah Bulan yang ingin dibayar: ");
        Bulan = input.nextInt();
        input.nextLine();

        System.out.println("Pilihan jalur masuk: ");
        System.out.println("1. SBMPTN\n2. SNMPTN\n3. Mandiri");
        System.out.print("Masukkan Pilihan Anda (1/2/3): ");
        Jalurmasuk = input.nextLine();

        switch (Jalurmasuk) {
            case "1":
                if (Pendapatan < 2000000) {
                    DSP = 5000000;
                    SPP = 500000;
                } else if (Pendapatan >= 2000000 && Pendapatan <= 10000000) {
                    DSP = 1500000;
                    SPP = 1000000;
                } else {
                    DSP = 30000000;
                    SPP = 2000000;
                }
                break;
            case "2":
                if (Pendapatan < 2000000) {
                    DSP = 7000000;
                    SPP = 500000;
                } else if (Pendapatan >= 2000000 && Pendapatan <= 10000000) {
                    DSP = 1700000;
                    SPP = 1000000;
                } else {
                    DSP = 35000000;
                    SPP = 2000000;
                }
                break;
            case "3":
                if (Pendapatan < 2000000) {
                    DSP = 1000000;
                    SPP = 100000;
                } else if (Pendapatan >= 2000000 && Pendapatan <= 10000000) {
                    DSP = 2500000;
                    SPP = 1000000;
                } else {
                    DSP = 50000000;
                    SPP = 3000000;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
input.close();
        SPP = Bulan * SPP;
        System.out.println("Besar SPP: Rp " + SPP);
        System.out.println("Besar DSP: Rp " + DSP);
        TotalBayar = DSP + SPP;
        System.out.println("Total Bayar: Rp " + TotalBayar);
    }
}