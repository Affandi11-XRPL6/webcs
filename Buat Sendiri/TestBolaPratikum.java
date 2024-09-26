public class TestBolaPratikum {
    public static void main(String[] args) {

        double Jarijari = 5.0;

        BolaPratikum bolaObj = new BolaPratikum(Jarijari);

        System.out.println("Diameter : " + bolaObj.Diameter());
        System.out.println("Luas Permukaan : " + bolaObj.luasPermukaan());
        System.out.println("Volume : " + bolaObj.Volume());

        double JarijariBaru = 8.0;
        bolaObj.setJarijari(JarijariBaru);

        System.out.println("Setelah di manipulasi");
        System.out.println("Diameter : " + bolaObj.Diameter());
        System.out.println("Luas Permukaan : " + bolaObj.luasPermukaan());
        System.out.println("Volume : " + bolaObj.Volume());
    }

}
