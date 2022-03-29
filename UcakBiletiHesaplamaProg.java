import java.util.Scanner;
public class UcakBiletiHesaplamaProg {
    public static void main(String[] args) {
        double mesafe, yas, yon, discount = 1, sonuc , yondiscount =1, sonuc2, yondiscount2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz :  ");
        mesafe = input.nextDouble();
        System.out.print("Lütfen Yaşınızı Giriniz : ");
        yas = input.nextDouble();
        System.out.print("Lütfen Gideceğiniz Yönü Giriniz Tek Yön:1, Çift Yön:2 : ");
        yon = input.nextDouble();


        if (mesafe<0 || yas<0 || yon<1 || yon>2 ) {
            System.out.println("Hatalı Veri Girdiniz !!!");
        }else {
            if (yas<12){
                discount = 0.5;
            }else if (yas>12 && yas<24){
                discount = 0.9;
            }else if (yas>65){
                discount = 0.7;
            }else if (yas>24 && yas<65) {
                discount = 1;

            }if (yon == 1){
                yondiscount = 1;
            }else if (yon == 2){
                yondiscount2 = 2;
                yondiscount = 0.8;
            }
        }sonuc = mesafe*0.1* yondiscount2 ;
        System.out.println("İndirimsiz Tutar : " + sonuc + "tl");

        sonuc2 = sonuc* discount * yondiscount ;
        System.out.println("İndirimli Tutar : " + sonuc2 + "tl");
        
    }
}
