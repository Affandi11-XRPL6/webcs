import java.util.Scanner;

public class SuhuConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Konversi suhu dari Celsius ke Fahrenheit/Reamur/Kelvin");
        System.out.print("Masukan suhu dalam Celsius (C): ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double reamur = celsius * 4 / 5;
        double kelvin = celsius + 273.15;

        System.out.print("Ketik 'R' untuk suhu Reamur, 'F' untuk suhu fahrenheit, 'K' untuk suhu kelvin: ");
        char TipeKonversiSuhu = input.next().charAt(0);

        switch (TipeKonversiSuhu)
        {
            case 'R':
            case 'r':
                System.out.println(reamur + " R");
                break;
            case 'F':
            case 'f':
                System.out.println(fahrenheit + " F");
                break;
            case 'K':
            case 'k':
                System.out.println(kelvin + " K");
                break;
            default:
                System.out.println("Kesalahan input! tolong ketik 'R' untuk Reamur, 'F' untuk Fahrenheit,'K'untuk Kelvin.");
                break;
        }

        input.close();
    }
}
