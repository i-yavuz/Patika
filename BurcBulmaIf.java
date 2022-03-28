import java.util.Scanner;

public class BurcBulmaIf {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();


        if (month >= 1 && month <= 12) {

        } else {
            isError = true;

        }
        if (isError) {
            System.out.println("Hatalı Ay Girdiniz");
        }
        System.out.print("Doğduğunuz Gün: ");
        day = input.nextInt();

        if (day >= 1 && day <= 31) {

        } else {
            isError = true;


        }
        if (isError) {
            System.out.println("Hatalı Gün Girdiniz");
        }

        if (month == 1) {
            if (day < 21) {
                burc = "Oğlak";
            }
            if (day >= 21 && day <= 31)
                burc = "Kova";
        }

        if (month == 2) {
            if (day < 20) {
                burc = "Kova";
            }
            if (day >= 20 && day <= 31)
                burc = "Balık";
        }

        if (month == 3) {
            if (day < 21) {
                burc = "Balık";
            }
            if (day >= 21 && day <= 31)
                burc = "Koç";
        }


        if (month == 4) {
            if (day < 20) {
                burc = "Koç";
            }
            if (day >= 20 && day <= 31)
                burc = "Boğa";
        }

        if (month == 5) {
            if (day < 22) {
                burc = "Boğa";
            }
            if (day >= 22 && day <= 31)
                burc = "İkizler";
        }
        if (month == 6) {
            if (day < 23) {
                burc = "İkizler";
            }
            if (day >= 23 && day <= 31)
                burc = "Yengeç";
        }

        if (month == 7) {
            if (day < 23) {
                burc = "Yengeç";
            }
            if (day >= 23 && day <= 31)
                burc = "Aslan";
        }

        if (month == 8) {
            if (day < 23) {
                burc = "Aslan";
            }
            if (day >= 23 && day <= 31)
                burc = "Başak";
        }

        if (month == 9) {
            if (day < 23) {
                burc = "Başak";
            }
            if (day >= 23 && day <= 31)
                burc = "Terazi";
        }

        if (month == 10) {
            if (day < 23) {
                burc = "Terazi";
            }
            if (day >= 23 && day <= 31)
                burc = "Akrep";
        }

        if (month == 11) {
            if (day < 22) {
                burc = "Akrep";
            }
            if (day >= 22 && day <= 31)
                burc = "Yay";
        }


        if (month == 12) {
            if (day < 22) {
                burc = "Yay";
            }
            if (day >= 22 && day <= 31)
                burc = "Oğlak";
        }


        if (isError) {
            System.out.println("Hatalı Giriş Yaptınız, Tekrar Deneyiniz");
        } else {
            System.out.println("Burcunuz : " + burc);
        }
    }
}
