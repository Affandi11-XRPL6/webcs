public class PraktikumBus {
    private double penumpang, maxPenumpang, counter, penumpangBaru, totalBeratPenumpang, maxBeratPenumpang;

    public PraktikumBus(double maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
        counter = 0;
        penumpangBaru = 0;
        totalBeratPenumpang = 0;
        maxBeratPenumpang = 50;
    }

    public void addPenumpang(double beratPenumpang) {
        double temp;
        temp = this.penumpang + 1;
        if (temp > maxPenumpang) {
            System.out.println("Overload penumpang");
        } else {
            this.penumpang = temp;
            counter++;
            penumpangBaru += 1;
            totalBeratPenumpang += beratPenumpang;
            maxBeratPenumpang = Math.max(maxBeratPenumpang, beratPenumpang);
        }
    }

    public double getPenumpang() {
        return penumpang;
    }

    public double getRataRataBerat() {
        if (penumpang == 0) {
            return 0;
        } else {
            return totalBeratPenumpang / penumpang;
        }
    }

    public double getMaxBerat() {
        return maxBeratPenumpang;
    }

    public void cetak() {
        System.out.println("Jumlah penumpang: " + penumpang);
        System.out.println("Kapasitas maksimum penumpang: " + maxPenumpang);
        System.out.println("Rata-rata berat penumpang baru: " +getRataRataBerat());
        System.out.println("Max berat penumpang: " + getMaxBerat());
    }

    public static void main(String[] args) {
        PraktikumBus busPraktikum = new PraktikumBus(20);

        busPraktikum.addPenumpang(5.0);
        busPraktikum.cetak();

        busPraktikum.addPenumpang(7.5);
        busPraktikum.cetak();

        busPraktikum.addPenumpang(2);
        busPraktikum.cetak();
    }
}
