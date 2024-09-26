package UKL;

public class TesProduk {
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        produk1.setNomor(0);
        produk1.setNama("");
        produk1.setJumlah(0);
        produk1.setHarga(0);

        Produk produk2 = new Produk();
        produk2.setNomor(0);
        produk2.setNama("");
        produk2.setJumlah(0);
        produk2.setHarga(0);

        Produk produk3 = new Produk(1, "Kursi", 10, 10000.00);
        Produk produk4 = new Produk(2, "Meja", 5, 15000.00);
        Produk produk5 = new Produk(3, "Lampu", 20, 5000.00);
        Produk produk6 = new Produk(4, "Rak", 7, 20000.00);

        produk1.printDetails();
        produk2.printDetails();
        produk3.printDetails();
        produk4.printDetails();
        produk5.printDetails();
        produk6.printDetails();

        DVD dvd1 = new DVD();
        dvd1.setNomor(0);
        dvd1.setNama("");
        dvd1.setJumlah(0);
        dvd1.setHarga(0);
        dvd1.setDurasiFilm(0);
        dvd1.setRatingUsia(0);
        dvd1.setStudioFilm ("");
        
        DVD dvd2 = new DVD();

        DVD dvd3 = new DVD(1, "Daredevil", 50, 25000.00, 99, 15, "20th Century Fox");
        DVD dvd4 = new DVD(2, "The insidious 4", 70, 30000.00, 143, 13, "Marvel Studios");
        DVD dvd5 = new DVD(3, "Logan the next gen", 30, 35000.00, 148, 16, "Warner Bros.");
        DVD dvd6 = new DVD(4, "Joker 2024", 40, 20000.00, 136, 17, "Warner Bros.");

        dvd1.printDetails();
        dvd2.printDetails();
        dvd3.printDetails();
        dvd4.printDetails();
        dvd5.printDetails();
        dvd6.printDetails();
    }
}
