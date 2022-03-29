import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yıl;
        String sonuc = "";
        System.out.print("Lütfen Doğum Yılınızı Giriniz : ");
        yıl = input.nextDouble();
        if (yıl % 12 == 0) {
            sonuc = "Maymun";
        } else if (yıl % 12 == 1) {
            sonuc = "Horoz";
        } else if (yıl % 12 == 2) {
            sonuc = "Köpek";
        } else if (yıl % 12 == 3) {
            sonuc = "Domuz";
        } else if (yıl % 12 == 4) {
            sonuc = "Fare";
        } else if (yıl % 12 == 5) {
            sonuc = "Öküz";
        } else if (yıl % 12 == 6) {
            sonuc = "Kaplan";
        } else if (yıl % 12 == 7) {
            sonuc = "Tavşan";
        } else if (yıl % 12 == 8) {
            sonuc = "Ejderha";
        } else if (yıl % 12 == 9) {
            sonuc = "Yılan";
        } else if (yıl % 12 == 10) {
            sonuc = "At";
        } else if (yıl % 12 == 11) {
            sonuc = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + sonuc);
    }
}
