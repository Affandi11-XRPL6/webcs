import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kelipatan: ");
        int kelipatan = input.nextInt();
        System.out.print("Masukkan Batas: ");
        int batas = input.nextInt();
        
        for (int x = 1; x <= batas; x++) {
            System.out.print(x + " x " + kelipatan + " = " + (x * kelipatan));
            System.out.println();
        }
    }
}