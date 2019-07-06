import java.util.Scanner;
public class EmailValid {
    public static boolean Validator(String email) {
        boolean temp = false;
        boolean y = false;
        for (int i = 0; i < email.length(); i++) {
            char x = email.charAt(i);
            if(i==email.length()-1&& !y){
                y = false;
            }
            else if(i>0){
                if(x == '@'){
                    temp = true;
                }
                if(x == '.'&& temp){
                    y = true;
                }
            }
            else{
                if(x == '@'){
                    y = false;
                }
            }
        }
        System.out.println("Is your email valid:");
        if(y){
            System.out.println("Valid");
        }
        else if(!y){
            System.out.println("Invalid!");
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = input.nextLine();
        Validator(email);
    }
}
