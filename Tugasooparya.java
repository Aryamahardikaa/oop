package tugasoop;
import java.util.Scanner;
/**
 *
 * @author T44o
 * IGustAgungNgurahAryaMahardika/2201010516
 */
public class Tugasoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang segitiga:");
        double alas = scanner.nextDouble();

        System.out.println("Masukkan tinggi segitiga:");
        double tinggi = scanner.nextDouble();

        double luasAlas = hitungLuasAlasSegitiga(alas, tinggi);
        System.out.println("Luas alas segitiga adalah: " + luasAlas);
    }

    public static double hitungLuasAlasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    
}
