import java.util.Scanner;

public class TanggaPlus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tinggi Tangga: ");
        int Nominal = input.nextInt();
        
        for (int A = 1; A <= Nominal; A++) {
            for (int B = 1; B <= A; B++) {
                System.out.print("+");
            }
            System.out.println();

  for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();




        }
    }
}