public class BolaPratikum{
    private double Jarijari;

    public BolaPratikum(Double Jarijari){
        this.Jarijari = Jarijari;

    }

    public void setJarijari(double Jarijari){
        this.Jarijari = Jarijari;

    }

    public double Diameter(){
        return 2 * Jarijari;
    }

    public double luasPermukaan(){
        return 4 * Math.PI * Math.pow(Jarijari, 2);

    }
    public double Volume(){
        return (4.0 / 3.0 ) * Math.PI * Math.pow(Jarijari, 3);
    }
}