import java.util.Scanner;

public class SuhuConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Konversi Suhu dari Celcius ke Fahrenheit, Kelvin, dan Reamur");
        System.out.print("Masukkan suhu dalam Celcius (C): ");
        double celcius = input.nextDouble();

        if (celcius >= -273.15) {
            double fahrenheit = (celcius * 9/5) + 32;
            double kelvin = celcius + 273.15;
            double reamur = celcius * 4/5;

            System.out.println("Hasil Konversi:");
            System.out.println("Fahrenheit: " + fahrenheit);
            System.out.println("Kelvin: " + kelvin);
            System.out.println("Reamur: " + reamur);
        } else {
            System.out.println("Suhu tidak valid! Celcius tidak boleh kurang dari -273.15");
        }

        input.close();
    }
}