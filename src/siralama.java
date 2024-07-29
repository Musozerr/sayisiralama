import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {
        int a,b,c,tmp;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz : ");
        a = sc.nextInt();
        System.out.println("2. sayıyı giriniz : ");
        b = sc.nextInt();
        System.out.println("3. sayıyı giriniz : ");
        c = sc.nextInt();
        int[] dizi = {a,b,c};

        for(int i = 0; i < dizi.length - 1 ; i++){
            for(int j = 0; j < dizi.length - 1 ; j++){
                if(dizi[j] > dizi[j+1]){
                        tmp = dizi[j];
                        dizi[j] = dizi[j+1];
                        dizi[j+1] = tmp;
                }
            }
        }
        System.out.println(dizi[0]+" "+dizi[1]+" "+dizi[2]);
    }
}
