package UKL;

public class Produk{
    
    private int nomor;
    private String nama;
    private int jumlah;
    private double harga;

    public Produk() {
        this.nomor = 0;
        this.nama = "";
        this.jumlah = 0;
        this.harga = 0.0;
    }
    public Produk(int nomor, String nama, int jumlah, double harga) {
        this.nomor = nomor;
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public int getNomor() {
        return nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void printDetails() {
        System.out.println("Nomor: " + nomor);
        System.out.println("Nama Produk: " + nama);
        System.out.println("Jumlah Stok: " + jumlah);
        System.out.println("Harga: Rp. " + harga);
        System.out.println();
    }
}

