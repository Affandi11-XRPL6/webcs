public class TestPraktikumBus {
    public static void main(String[] args) {
        PraktikumBus busPraktikum = new PraktikumBus(20);

        busPraktikum.addPenumpang(7.0);
        busPraktikum.cetak();

        busPraktikum.addPenumpang(8.0);
        busPraktikum.cetak();

        busPraktikum.addPenumpang(9.0);
        busPraktikum.cetak();
    }
}
