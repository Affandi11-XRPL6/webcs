import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
     
        System.out.println("Masukkan Nama : ");
        String Nama = input.nextLine();
        System.out.println("input Besar Pemakaian : ");
        double Pemakaian = input.nextDouble();
         Double Tagihan = null;
    
if (Pemakaian > 250){
Tagihan = (Pemakaian * 300) * 0.2;
} else if (Pemakaian <= 250 && Pemakaian > 150){
Tagihan = (Pemakaian * 250) * 0.2;
} else if (Pemakaian <= 150 && Pemakaian > 50){
Tagihan = (Pemakaian * 150) * 0.2;
} else if (Pemakaian <= 50 ){
Tagihan = (Pemakaian * 50) * 0.2; 
} else { 
System.out.println("ERROR , PERIKSA KEMBALI INPUTAN ANDA");

}
System.out.println("Tagihan anda : RP " + Tagihan);




    }
}
