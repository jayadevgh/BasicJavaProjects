import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        System.out.print("Factors of " + number + " are: ");
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum+=i;
            }
        }
        sum -= number;
        System.out.println();
        if(sum==number){
            System.out.println("By the way, your number was a perfect number! :)");
        }
    }
}
