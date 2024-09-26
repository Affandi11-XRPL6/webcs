import java.util.Scanner;

public class Op2 {

public static void main(String[] args) {
        System.out.println("input dg format True False :");
    Scanner scn = new Scanner(System.in);
boolean A= scn.nextBoolean();
boolean B= scn.nextBoolean();
boolean C= scn.nextBoolean();
// System.out.println(A&B);
System.out.println(A||B||C);
// System.out.println(!A +" "+ !B +" "+ !C);

}
}