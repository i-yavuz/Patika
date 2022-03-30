
import java.util.Scanner;
public class UcVeDortBolunebilme {
    public static void main(String[] args) {
        double uceB=0, uceCount=0, dortB=0, dortCount=0;
        System.out.print("Sayı giriniz :");
        Scanner inp = new Scanner(System.in);
        int k = inp.nextInt();

        for (int i=1; i <=k; i++){

            if (i%3==0){
                uceB+=i;
                uceCount++;
            }
            if (i%4==0){
                dortB+=i;
                dortCount++;
            }
        }
        System.out.println("Üçe ve dörte tam olarak bölünen sayıların ortalaması :"+((uceB+dortB)/(uceCount+dortCount)));
    }
}