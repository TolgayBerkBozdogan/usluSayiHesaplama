import java.util.Scanner;

public class usluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n, total=1;
        System.out.print("Üssü alınacak sayıy giriniz: ");
        n = input.nextInt();
        System.out.print("Üssü girin:");
        k = input.nextInt();
        for(int i = 1; i<=k; i++){
            total *=n;
        }

       /* int i = 1;
        while (i<=k) {
            total *=n;
            i++;
        }*/

        System.out.print(total);
    }
}
