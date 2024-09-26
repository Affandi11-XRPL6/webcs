package UKL;

public class DVD extends Produk {
    private int durasiFilm;
    private int ratingUsia;
    private String studioFilm;

    public DVD() {
        super();
        this.durasiFilm = 0;
        this.ratingUsia = 0;
        this.studioFilm = "";
    }

    public DVD(int nomor, String nama, int jumlah, double harga, int durasiFilm, int ratingUsia, String studioFilm) {
        super(nomor, nama, jumlah, harga);
        this.durasiFilm = durasiFilm;
        this.ratingUsia = ratingUsia;
        this.studioFilm = studioFilm;
    }

    public int getDurasiFilm() {
        return durasiFilm;
    }

    public void setDurasiFilm(int durasiFilm) {
        this.durasiFilm = durasiFilm;
    }

    public int getRatingUsia() {
        return ratingUsia;
    }

    public void setRatingUsia(int ratingUsia) {
        this.ratingUsia = ratingUsia;
    }

    public String getStudioFilm() {
        return studioFilm;
    }

    public void setStudioFilm(String studioFilm) {
        this.studioFilm = studioFilm;
    }

    
    public void printDetails() {
        System.out.println("Nomor: " + getNomor());
        System.out.println("Nama DVD: " + getNama());
        System.out.println("Durasi Film: " + durasiFilm + " menit");
        System.out.println("Rating Usia: " + ratingUsia);
        System.out.println("Studio Film: " + studioFilm);
        System.out.println("Jumlah Stok: " + getJumlah());
        System.out.println("Harga: Rp. " + getHarga());
        System.out.println();
    }
}

