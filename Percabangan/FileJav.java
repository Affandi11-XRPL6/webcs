import java.util.Scanner;

public class FileJav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama = ");
        String Nama = input.nextLine();
        System.out.println("Masukan Nilai = ");
        int Nilai = input.nextInt();
        String predikat, Kriteria;

        predikat = null;
        Kriteria = null;


        if (Nilai >= 96 && Nilai <= 100) {
            predikat = "A+";
            Kriteria = "Sangat Baik";
        } else if (Nilai >= 91 && Nilai <= 95) {
            predikat = "A-";
            Kriteria = "Sangat Baik";
        } else if (Nilai >= 86 && Nilai <= 90) {
            predikat = "B+";
            Kriteria = "Baik";
        }else if (Nilai >=81 && Nilai <=85){
             predikat = "B";
            Kriteria = "Baik";
        }else if (Nilai >=75 && Nilai <=80){
             predikat = "B-";
            Kriteria = "Baik";
        }else if (Nilai >=81 && Nilai <=80){
             predikat = "B";
            Kriteria = "Baik";
        }else if (Nilai >=70 && Nilai <=74){
             predikat = "C+";
            Kriteria = "Cukup";
         }else if (Nilai >=65 && Nilai <=69){
             predikat = "C";
            Kriteria = "Cukup";
         }else if (Nilai >=55 && Nilai <=59){
             predikat = "D+";
            Kriteria = "Kurang";
         }else if (Nilai >=0 && Nilai <=54){
             predikat = "D";
            Kriteria = "Kurang";
         }
         input.close();
         
         System.out.println("Nama: " + Nama);
         System.out.println("Nilai: " + Nilai);
         System.out.println("Predikat: " + predikat);
         System.out.println("Kriteria: " + Kriteria);

        }
    }
