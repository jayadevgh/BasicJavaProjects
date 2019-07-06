import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a word. The computer wil check whether it is a palindrome.");
        Scanner input = new Scanner(System.in);
        String input2,input3 = "";
        input2 = input.nextLine();
        int n = input2.length();
        for(int i = n - 1; i > -1; i--)
        {
            input3 = input3 + input2.charAt(i);
        }
        System.out.println(input3);
        if(input2.equals(input3)){
            System.out.println("The word is a palindrome.");
        }else{
            System.out.println("The word is not palindrome.");
        }
    }
}
