import java.util.Scanner;
public class PrimeNumbers {
    public static void PrimeNum(int q){
        int count =0;
        for (int i = 2; i <= q; i++) {
            boolean x = false;
            for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        x = true;
                    }
            }
            if(!x){
                count++;
                System.out.println("Prime number "+count+": "+i);
            }
        }
        System.out.println("There are "+ (count)+" prime numbers within "+(q)+".");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        PrimeNum(num);
    }
}
