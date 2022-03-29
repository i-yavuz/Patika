import java.util.Scanner ;
public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        int yıl;
        Scanner input = new Scanner (System.in);
        System.out.print("Lütfen Yıl Giriniz : ");
        yıl = input.nextInt();
        if (yıl %400 == 0){
            System.out.println(yıl + " Artık Yıldır. ");
        }else if ((yıl %4 ==0) && (yıl %100 != 0)){
            System.out.println(yıl + " Artık Yıldır.");
        }else {
            System.out.println(yıl + " Artık Yıl Değildir.");
        }
    }
}
