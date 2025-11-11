public class lingkaran {
    private double jari;
    public lingkaran(double r){
        jari = r;
    }
    public double getJari(){
        return jari;
    }
    public void setJari(double jari){
        this.jari = jari;
    }
    public double getLuas(){
        return Math.PI * jari * jari;
    }
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

}
