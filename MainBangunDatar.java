import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("=== SEGITIGA ===");
        System.out.print("Masukkan alas   : ");
        double alas = scn.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = scn.nextDouble();

        segitiga s = new segitiga(alas, tinggi);
        System.out.println("Luas : " + s.getLuas());
        System.out.println("Keliling : " + s.getKeliling());

        System.out.println("\n=== PERSEGI ===");
        System.out.print("Masukkan sisi : ");
        double sisi = scn.nextDouble();

        persegi p = new persegi(sisi);
        System.out.println("Luas : " + p.getLuas());
        System.out.println("Keliling : " + p.getKeliling());

        System.out.println("\n=== LINGKARAN ===");
        System.out.print("Masukkan jari-jari : ");
        double jari = scn.nextDouble();

        lingkaran l = new lingkaran(jari);
        System.out.println("Luas : " + l.getLuas());
        System.out.println("Keliling : " + l.getKeliling());
    }
}