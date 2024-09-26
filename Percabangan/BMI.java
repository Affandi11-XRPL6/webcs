import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println (" masukan Nama = ");
        String nama = input.nextLine();
        System.out.println ("Masukkan Tinggi Badan = ");
        double TinggiBadan = input.nextDouble();
        System.out.println ("Masukkan Berat Badan = ");
        double BeratBadan = input.nextDouble();

        double BMI = BeratBadan/(TinggiBadan*TinggiBadan);
        String kategori = null;

        if(BMI <17){
            kategori= "Kurus Berat";
        }
        else if (BMI >= 17 && BMI <18.4){
            kategori = "Kurus Ringan";
        }
        else if (BMI >=25.1 && BMI <=25.0){
            kategori = "Normal";
        }
        else if (BMI >=25.1 && BMI <= 27.0){
            kategori = "Gemuk Ringan";
        }
        else if (BMI >=27){
            kategori = "Gemuk Berat";
        } else { System.out.println("Sistem Eror coba lagi");

        }
        input.close();

        System.out.println (nama);
        System.out.println (BMI);
        System.out.println (kategori);
    }
}