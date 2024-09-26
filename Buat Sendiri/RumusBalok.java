import java.util.Scanner;

public class RumusBalok {

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    double panjang,lebar,tinggi,Volume,LuasPermukaan;
    System.out.println("input Panjang :");
    panjang = scn.nextDouble();
    System.out.println("input Lebar :");
    lebar = scn.nextDouble();
    System.out.println("input Tinggi :");
     tinggi = scn.nextDouble();
     Volume = (panjang*lebar*tinggi);
     LuasPermukaan = (2*(panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    
    System.out.println("luas : "+ Volume+ " cm3");
    System.out.println("LuasPermukaan : "+ LuasPermukaan+"cm3");
    
}
}