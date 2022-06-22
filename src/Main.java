import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double tutar;
        System.out.print("Bir tutar giriniz: ");
        tutar= inp.nextDouble();

        if(tutar >0 && tutar<999){
            System.out.print("KDV orani %18 ile hesaplanmistir: "+(tutar*(0.18)));
        } else if (tutar>=1000) {
            System.out.print("KDV orani %8 ile hesaplanmistir: "+(tutar*(0.8)));
        }else{
            System.out.println("Hatali bir giris yaptiniz.");
        }
    }
}
