public class Array1 {
    public static void main(String[] args) {
        
    // String[]Keranjang = {"Semangka", "Apel", "Nanas"};

    //     for (int i = 0; i < Keranjang.length; i++){
    //         System.out.println("Keranjang " + i + " = " + Keranjang[i]);
    //     }
 
    String[][] NamadanAlamat = {{ "Rayhan", "Malang" },{ "Diva", "Banyuwangi" }};

     for (int i = 0; i < NamadanAlamat.length; i++) {
        System.out.println("Nama : " + NamadanAlamat[i][0]);
        System.out.println("Alamat : " + NamadanAlamat[i][1]);
        System.out.println("_________________");
    }
    System.out.println();

        
    }
}