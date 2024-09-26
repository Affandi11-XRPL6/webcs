
import java.util.Scanner;

public class bintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tinggi, pilihan;
        System.out.print("masukan pilihan: ");
        pilihan=input.nextInt();
        switch (pilihan) {
            case 1:
                 System.out.print("masukan tinggi segitiga:");
                tinggi = input.nextInt();
                for (int x = 0; x<tinggi; x++ ){
                for (int y = 0; y < x; y++){
                    System.out.print("* ");
                }
                System.out.println("*");
            }
            break;
            
            case 2:
            System.out.print("masukan tinggi segitiga:");
            tinggi = input.nextInt();
            for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            break;

            case 3:
            System.out.print("masukan tinggi segitiga:");
            tinggi = input.nextInt();
            for (int t = 0; t < 2; t++) {
                if (t == 0) {
                    for (int i = tinggi; i >= 1; i--) { // Mengubah urutan dari tinggi ke 1
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 1; i <= tinggi; i++) { // Mengubah urutan dari 1 ke tinggi
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                }
            }
            case 4:
            System.out.print("masukan tinggi segitiga:");
            tinggi = input.nextInt();
            for (int t = 0; t < 2; t++) {
            if (t == 0) {
                for (int i = 1; i <= tinggi; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
            } else {
            for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            break;
            }
        }
    }
    input.close();
}
}