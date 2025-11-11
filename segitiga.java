public class segitiga {
    private double alas;
    private double tinggi;

    public segitiga(double a, double t){
        alas = a;
        tinggi = t;
    }
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getLuas(){
        return 0.5 * alas * tinggi;
    }
    public double getKeliling(){
        double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + tinggi + sisiMiring;
    }
}
