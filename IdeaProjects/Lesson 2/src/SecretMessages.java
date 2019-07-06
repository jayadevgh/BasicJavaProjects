import java.util.Scanner;
public class SecretMessages {
    public static void WordChanger(String charac, String word){
        char Character = charac.charAt(0);
        int shift = Character - 97;
        for (int i = 0; i < word.length(); i++) {
            char theChar = word.charAt(i);
            if (theChar == ' '|| theChar == '.'|| theChar == '\''|| theChar == '1'|| theChar == '2'|| theChar == '3'|| theChar == '4'|| theChar == '5'|| theChar == '6'|| theChar == '7'|| theChar == '8'|| theChar == '9'||theChar == ','||theChar == ':'){
            }
            else if ((theChar > 90-shift && theChar < 91) || (theChar >122-shift && theChar < 123)){
                theChar -= 26-shift;
            }else {
                theChar += shift;
            }
            System.out.print(theChar);
        }
        System.out.println();
    }
    public static void CrackMessage(String word){
        char character = 97;
        int shift =0;
        while (true) {
            char theChar = ' ';
            for (int i = 0; i < 26; i++) {
                shift = character - 97;
                for (int x = 0; x < word.length(); x++) {
                    theChar = word.charAt(x);
                    if (theChar == ' ' || theChar == '.'|| theChar== '\''|| theChar == '1'|| theChar == '2'|| theChar == '3'|| theChar == '4'|| theChar == '5'|| theChar == '6'|| theChar == '7'|| theChar == '8'|| theChar == '9'||theChar == ','||theChar == ':') {

                    } else if ((theChar > 90 - shift && theChar < 91) || (theChar > 122 - shift && theChar < 123)) {
                        theChar -= 26 - shift;
                    } else {
                        theChar += shift;
                    }
                    System.out.print(theChar);
                }
                System.out.println();
                character++;
                System.out.println(character+ " shift: ");
            }
            if (character > 121){
                break;
            }
        }

    }
    public static void main (String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter a character in lowercase to show how much shift you want.");
        String Shift = input.nextLine();
        System.out.println("Now enter a message. Your message will be translated based on the shift.");
        String Message = input.nextLine();
        WordChanger(Shift, Message);
        System.out.println("Now enter a secret message and the computer will give different possibilities of what the code could be.");
        String SecretMessage = input.nextLine();
        System.out.println("a shift:");
        CrackMessage(SecretMessage);
    }


}