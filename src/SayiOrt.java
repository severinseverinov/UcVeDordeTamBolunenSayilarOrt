import java.util.Scanner;

public class SayiOrt {
    public static void main(String[] args) {
        int k,x=0,toplam=0;

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı gir : ");
        k=input.nextInt();

        for(int i=1;i<=k;i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                x++;
            }
        }
        System.out.println("Sayıların ortalaması : "+(toplam/x));
    }
}
