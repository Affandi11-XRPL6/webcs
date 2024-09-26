import java.util.Scanner;

public class operator{
public static void main(String[] args) {
    
    System.out.println("input dg format MTK/BI/BING :");
    Scanner scn = new Scanner(System.in);
    double nilaiMtk = scn.nextDouble();
    double nilaiBI = scn.nextDouble();
    double nilaiBing = scn.nextDouble();

    double hasil = (nilaiMtk+nilaiBI+nilaiBing)/3;
    System.out.println("rata-rata Nilai : "+hasil);

}
}