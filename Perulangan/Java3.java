import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        int NilaiAtas, NilaiBawah;
        int total=0;
        Scanner S = new Scanner(System.in);
        System.out.println("Masukkan Nilai Bawah : ");
        NilaiBawah = S.nextInt();
        System.out.println("Masukkan Nilai Atas : ");
        NilaiAtas = S.nextInt();

        for(int i=NilaiBawah; i<=NilaiAtas; i++){
            total +=i;
        }
        
        System.out.println("Hasil Penjumlahan : " + total);
    }
}
