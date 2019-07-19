import java.util.*;
public class BullsAndCows {
    public static void Sol(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("  __________________________________________________________________\n"+
                           " | Hi, I am the floating head. Let's play a game of cows and bulls. |\n " +
                           "| In cows and bulls, you have to guess a four digit number.        |\n " +
                           "| If you have one of the digits right, that would be a cow.        |\n" +
                           " | If you have a digit in the right place, that would be a bull.    |     *************\n"+
                           " | Remember all bulls are cows.                                     |     *  |     |  *\n"+
                           " |___________________________________________________________________\\    *           *\n"+
                           "                                                                          *  \\_____/  *\n"+
                           "                                                                          *************\n");
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int[]compArr = {0,0,0,0,0,0,0,0,0,0,0};
        int a = 4;
        int x;
        int[] posArr = {0,0,0,0};
        for (int i = 0; i < a; i++) {
            x= rand.nextInt(10);
            if(x ==0){
                i--;
            }
            else if(compArr[x]<1) {
                compArr[x] += 1;
                posArr[i]+=x;
            }
            else{
                i--;
            }
        }
        a =1;
        int count =0;
        while(true){
            boolean shouldBreak = false;
            boolean allFour = false;
            int cow =0;
            int bull = 0;
            int[] userPos = {0,0,0,0};
            for (int i = 0; i < a; i++) {
                System.out.println(" _______________________________      *************\n" +
                                   "|Please enter your first digit. |     *  )     )  *\n" +
                                   "|________________________________\\    *           *\n" +
                                   "                                      *  \\_____/  *\n" +
                                   "                                      *************");
                int stDigit = input.nextInt();
                userPos[0] = stDigit;
                if (stDigit > 9) {
                    System.out.println(" ________________________________________      *************\n" +
                                       "|Make sure you are only typing one digit.|     *  /\\   /\\  *\n" +
                                       "|_________________________________________\\    *           *\n" +
                                       "                                               *    _____  *\n" +
                                       "                                               *************");
                    i = 0;
                } else {
                    System.out.println(" _______________________________      *************\n" +
                                       "|Please enter your second digit.|     *  (     (  *\n" +
                                       "|________________________________\\    *           *\n" +
                                       "                                      *  \\_____/  *\n" +
                                       "                                      *************");
                    int ndDigit = input.nextInt();
                    if (ndDigit == stDigit|| ndDigit>9) {
                        System.out.println(" ____________________________________________________________\n" +
                                           "|Make sure you don't repeat a digit when typing your number. |     *************\n" +
                                           "|Also make sure you are only typing one digit.               |     *  --  --   *\n" +
                                           "|_____________________________________________________________\\    *           *\n" +
                                           "                                                                   *  ______   *\n " +
                                           "                                                                  *************");
                        i = 0;
                    } else {
                        userPos[1] = ndDigit;
                        System.out.println(" _______________________________      *************\n" +
                                           "|Please enter your third digit. |     *  (     )  *\n" +
                                           "|________________________________\\    *           *\n" +
                                           "                                      *  \\_____/  *\n" +
                                           "                                      *************");
                        int rdDigit = input.nextInt();
                        if (rdDigit == stDigit || rdDigit == ndDigit||rdDigit>9) {
                            System.out.println(" ____________________________________________________________\n" +
                                    "|Make sure you don't repeat a digit when typing your number. |     *************\n" +
                                    "|Also make sure you are only typing one digit.               |     *  --  --   *\n" +
                                    "|_____________________________________________________________\\    *           *\n" +
                                    "                                                                   *  ______   *\n " +
                                    "                                                                  *************");
                            i = 0;
                        } else {
                            userPos[2] = rdDigit;
                            System.out.println(" _______________________________      *************\n" +
                                               "|Please enter your fourth digit.|     *  |     |  *\n" +
                                               "|________________________________\\    *           *\n" +
                                               "                                      *  \\_____/  *\n" +
                                               "                                      *************");
                            int thDigit = input.nextInt();
                            if (thDigit == stDigit || thDigit == ndDigit || thDigit == rdDigit||thDigit>9) {
                                System.out.println(" ____________________________________________________________\n" +
                                        "|Make sure you don't repeat a digit when typing your number. |     *************\n" +
                                        "|Also make sure you are only typing one digit.               |     *  --  --   *\n" +
                                        "|_____________________________________________________________\\    *           *\n" +
                                        "                                                                   *  ______   *\n " +
                                        "                                                                  *************");
                                i = 0;
                            } else {
                                userPos[3] = thDigit;
                                allFour = true;
                            }
                        }
                    }
                }
            }
            if(allFour) {
                System.out.println("Your number is:");
                Sol(userPos);
                for (int i = 0; i < posArr.length; i++) {
                    for (int j = 0; j < userPos.length ; j++) {
                        if(posArr[i] == userPos[j]){
                            cow++;
                        }
                    }
                    if (posArr[i] == userPos[i]) {
                        bull++;
                    }
                }
                System.out.println(" _________________________________     *************\n" +
                                   "|There are "+cow+" cows and "+bull+" bulls.    |    *  |     |  *\n" +
                                   "|__________________________________\\   *           *\n" +
                                   "                                       *  \\_____/  *\n" +
                                   "                                       *************\n");
                count++;
            }
            if (bull ==4){
                System.out.println(" ____________     *************\n" +
                                   "|Yay you win!|    *  /\\   /\\  *\n" +
                                   "|_____________\\   *           *\n" +
                                   "                  *  \\_____/  *\n" +
                                   "                  *************");
                shouldBreak = true;
            }else if(count == 10){
                System.out.println(" _________     *************\n" +
                                   "|You lost!|    *  /\\   /\\  *\n" +
                                   "|__________\\   *   .       *\n" +
                                   "               *  ._____   *\n" +
                                   "               *************");
                shouldBreak = true;
            }
            if(shouldBreak){
                break;
            }
        }
    }
}
