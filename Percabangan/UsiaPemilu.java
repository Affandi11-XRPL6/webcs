import java.util.Scanner;

        public class UsiaPemilu {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int Usia;
        System.out.println ("Masukan Umur : ");
            Usia = input.nextInt();
if (Usia > 17) {
    System.out.println ("Anda boleh mengikuti pemilu ;) ");
}
else { System.out.println ("Maaf anda belum boleh mengkuti pemilu :( ");

}
    }
}