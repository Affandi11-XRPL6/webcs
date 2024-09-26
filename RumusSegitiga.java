import java.util.Scanner;

public class RumusSegitiga {
public static void main(String[] args) {
    
    System.out.println("input dg format LA/T :");
    Scanner scn = new Scanner(System.in);
    double LA = scn.nextDouble();
    double T = scn.nextDouble();
    double Luas = (LA*T*1/2);
System.out.println(Luas+" cm2");
}
}