import java.util.Scanner;

public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double RataRata, Total = 0, Nilai;

        for(int i = 1; i <=5; i++);
        System.out.println("Masukkan nilai : ");
        Nilai = input.nextDouble();

        Total = Total + Nilai;
        RataRata = Total / 5;

        System.out.println("Rata-rata nilai : " + RataRata);
    }
}
