import java.util.Scanner;

public class RumusPersegi {
    public static void main(String[] args) {
        System.out.println("input sisi : ");
        Scanner scn = new Scanner(System.in);
        double sisi = scn.nextDouble();
         double luas = (sisi*sisi);
        System.out.println("luas : "+ luas);
   
    }
}