import java.util.Scanner;
public class StepsDivider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int x = num;
        int count = 0;
        if (num>1) {
            while (num != 1) {
                int y =(num-1);

                if(y%3==0&&(y%3)%3 == 0){
                    System.out.println("Number subtracted by one.");
                    num--;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                    System.out.println("Number divided by three.");
                    num = num / 3;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                    System.out.println("Number divided by three.");
                    num = num / 3;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                }
                else if (num % 3 == 0) {
                    System.out.println("Number divided by three.");
                    num = num / 3;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                } else if (num % 2 == 0) {
                    System.out.println("Number divided by two.");
                    num = num / 2;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                } else {
                    System.out.println("Number subtracted by one.");
                    num--;
                    System.out.println("Number is now: " + num);
                    count++;
                    System.out.println();
                }

            }
        }else{
            System.out.println("Sorry, we can't do numbers less than 1.");
        }
        System.out.println("It has taken "+count + " tries to get " + x + " to 1.");
    }
}
