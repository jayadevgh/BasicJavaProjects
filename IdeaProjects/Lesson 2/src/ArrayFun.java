import java.util.Scanner;
public class ArrayFun {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int arraySize = input.nextInt();
        System.out.println("Now enter the values of you array:");
        int [] tiny = new int [arraySize];
        int count = 0;
        while (count < arraySize) {
            int addArray = input.nextInt();
            tiny[count] = addArray;
            count++;
        }
        int min = tiny[0];
        int max = tiny[0];
        for (int i = 0; i < arraySize; i++) {
            if (tiny[i]< min){
                min = tiny[i];
            }
            else if (tiny[i] > max){
                max = tiny[i];
            }
        }
        System.out.println("'");
        String userAsk = input.nextLine();
        if (userAsk.equals("min")){
            System.out.println(min);
        }
        else if(userAsk.equals("max")){
            System.out.println(max);
        }
    }
}
