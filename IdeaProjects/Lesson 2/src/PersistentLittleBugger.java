import java.util.Scanner;
public class PersistentLittleBugger {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        int count = 0;
        //double x = 1;
        double digit =0;
        double product=1;
//        while(true){
//            if(userNum<10){
//                break;
//                count++;
//            }else{
//                for (int i = 0; i < ((int)userNum/10) + 1; i++) {
//                    for (int j = 0; j < 5; j++) {
//                        digit = (userNum/x) %10;
//                        x = x*10;
//                        userNum*=x;
//                        count++;
//                    }
//                }
//            }
//        }

        double temp = userNum;
        while(true){
            while (temp > 1) {
                digit = (int) temp % 10;
                product *= digit;
                temp = temp / 10;
            }
            count++;
            if(product>=10) {
                temp = product;
                System.out.println(temp);
                product = 1;
                digit = 0;

            }
            else{
                temp = product;
                break;
            }
        }
        System.out.println("It took " + count + " times to make " + userNum+" into " + temp + ". ");
    }
}
