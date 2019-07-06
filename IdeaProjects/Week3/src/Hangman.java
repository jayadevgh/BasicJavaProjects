import java.io.*;
import java.util.*;
public class Hangman {
    public static void main(String[] args) throws FileNotFoundException
    {

        try {
            Random rand = new Random();
            // The name of the file to open.
            File myFile = new File("/Users/jdg/IdeaProjects/Week3/src/Words");

            Scanner fileScanner = new Scanner(myFile);
            ArrayList<String> myArray = new ArrayList<>();

            while (fileScanner.hasNext()) {
                String myWord = fileScanner.next();
                myArray.add(myWord);
            }

            System.out.println("Let's play hangman against the computer. This is how many letters you have.");
            int i = rand.nextInt(myArray.size());
            String word = myArray.get(i);
            char[] arr = new char[word.length()];
            char[] toFill = new char[word.length()];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = word.charAt(j);
                toFill[j] = '*';
            }
            int trial = 0;
            boolean found = false;
            int correct = 0;
            boolean asterik = true;
            boolean solved = false;
                while (correct != toFill.length) {
                    //boolean asterik = false;
                    found = false;
                    for (int j = 0; j < toFill.length; j++) {
                        System.out.print(toFill[j]);
                    }


                    // entering a letter (user input)
                    System.out.println();
                    System.out.println("Please enter a letter.");
                    Scanner input = new Scanner(System.in);
                    char letter = ' ';
                    char userInput = input.next().charAt(0);

                    // for loop to cross reference
                    for (int k = 0; k < arr.length; k++) {
                        letter = word.charAt(k);
                        // to check if the letter has been used
                        if (userInput == toFill[k]) {
                            System.out.println("Letter has been used.");
                            found = true;
                        }

                        // to check if you guessed the letter right
                        else if (userInput == letter) {

                            System.out.println("Yay you guessed a letter!");
                            for (int l = 0; l < arr.length; l++) {
                                if (userInput == arr[l]) {
                                    toFill[l] = userInput;
                                    correct += 1;
                                }

                            }
                            found = true;
                        }
                    }

                    // to check if you guessed the letter wrong
                    if (!found) {
                        trial++;
                        if (trial == 1) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  |   ");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("__|__");

                        } else if (trial == 2) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (O_O)");
                            System.out.println("  |");
                            System.out.println("  |");
                            System.out.println("__|__");

                        } else if (trial == 3) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (O_O)");
                            System.out.println("  |   |");
                            System.out.println("  |");
                            System.out.println("__|__");
                        } else if (trial == 4) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (^_^)");
                            System.out.println("  |  /|");
                            System.out.println("  |");
                            System.out.println("__|__");

                        } else if (trial == 5) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (^_^)");
                            System.out.println("  |  /|\\");
                            System.out.println("  |  ");
                            System.out.println("__|__");
                        } else if (trial == 6) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (^_^)");
                            System.out.println("  |  /|\\");
                            System.out.println("  |  / ");
                            System.out.println("__|__");
                        } else if (trial == 7) {
                            System.out.println("Letter not found in word!");
                            System.out.println("   ___");
                            System.out.println("  |   |");
                            System.out.println("  | (*_*)");
                            System.out.println("  |  /|\\");
                            System.out.println("  |  / \\");
                            System.out.println("__|__");
                            break;
                        }

                    }
                }

            // check the winner of the game
            if (trial != 7 ) {
                for (int j = 0; j < toFill.length; j++) {
                    System.out.print(toFill[j]);
                }
                System.out.println();
                System.out.println("You got the word! The word was '" + word + "'.");
            }
            if (trial == 7) {
                System.out.println("You lose! The man was hanged.The word was '" + word + "'.");
            }

        }
        catch (Exception e)
        {
            System.out.println("File not found");
        }
    }
}