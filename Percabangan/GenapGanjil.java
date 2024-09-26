/**
 * GenapGanjil
 */
import java.util.Scanner;
public class GenapGanjil {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int bilangan;

  System.out.println("Masukan Bilangan Sembarang : ");
        bilangan = input.nextInt();

if (bilangan % 2 == 0) 
{ System.out.println(bilangan + " = adalah bilangan GENAP");
} else {
        System.out.println(bilangan + " = adalah bilangan GANJIL ");
        input.close();
        }
    }
}