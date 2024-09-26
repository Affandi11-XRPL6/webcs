public class Mobil {
    private int penumpang;
    private int maxPenumpang;

    public Mobil(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        this.penumpang = 0;
    }

    public void cetak() {
        System.out.println("Jumlah penumpang: " + penumpang);
        System.out.println("Kapasitas maksimum penumpang: " + maxPenumpang);
    }
    
    public void getPenumpang(String password) {
        String correctPassword = "1234";

        if (password.equals(correctPassword)) {
            System.out.println("Masukkan data penumpang baru:");
            System.out.println("Data penumpang berhasil ditambahkan.");
        } else {
            System.out.println("Password salah. Tidak dapat menambahkan penumpang.");
        }
    }
}
