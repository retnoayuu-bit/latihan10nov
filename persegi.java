public class persegi {
    private double sisi;
    public persegi(double s){
        sisi = s;
    }
    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getLuas(){
        return sisi * sisi;
    }
    public double getKeliling(){
        return 4 * sisi;
    }
}
