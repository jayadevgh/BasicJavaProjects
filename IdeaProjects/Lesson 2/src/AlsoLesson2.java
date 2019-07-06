import java.util.Scanner;
public class AlsoLesson2 {
    static void bubbleSortJava(int[] arr){
        int n = arr.length;
        int temp =0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }


        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            //Let input be a new scanner
        /*System.out.println("Please enter your height:");
        //Asks user to enter height
        int heightInInches = input.nextInt();
        //User will enter height here
        boolean canRide = heightInInches >= 50;
        // Will return True or False depending on whether the height is less than or greater than 50
        if (canRide == true) {
        // Checks whether if user is as tall as or taller than 50 inches
            System.out.println("You may ride.");
            // Tells user they may ride
        }
        else {
            // If the user is less than 50 inches...
            System.out.println("You are too short to ride.");
            // ... they are given the message that they are too short to ride.
        }
        System.out.println("Please type in your previous test score rounded to the nearest tenth.");
        // Asking for the user to type in their previous test score rounded to the nearest tenth.
        int gradeInTest = input.nextInt();
        switch (gradeInTest){
            case 100:
                System.out.println("A+! Congratulations! You worked very hard for the test.");
                break;
            case 90:
                System.out.println("B+. Good job!");
                break;
            case 80:
                System.out.println("C+. Did you study? Did you study enough?");
                break;
            case 70:
                System.out.println("D+. You did not pass. Why did you not study??!!");
                break;
            default:
                System.out.println("F!!! What a horrible grade!! How could you possibly get a score that bad!");
                break;
        }
        */

        System.out.println("This is the guessing game. Player 1, please type in your word. Press enter after you are finished and please don't include any spaces. Also, make sure your word is at least 5 letters. Player 2, no peeking!");
        String playerInput1 = input.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        //System.out.flush();
        System.out.println("Player 2, It is time for you to guess Player 1's word.");
        boolean one = true;
        int count  = 0;
        while (one == true){
            String playerInput2 = input.nextLine();
            count++;
            if (playerInput2.equals(playerInput1)){
                System.out.println("You have guessed the word!! The word was: " + playerInput1);
                System.out.println("You have taken " + count + " tries.");
                break;
            }
            else{
                System.out.println("You have guessed the wrong word. Please try again. If you want to give up, type in the words 'give up'. ");
            }
            if (count >= 1 && count < 3){
                System.out.println("Hint: The word has " + playerInput1.length() + " letters.");
            }
            if (count >= 3 && count < 7){
                System.out.println("Hint: The word has " + playerInput1.length() + " letters.");
                System.out.println("Hint: The word starts with the letter '" + playerInput1.substring(0,1) + "'.");
            }
            if (count >= 7&& count < 11){
                System.out.println("Hint: The word has " + playerInput1.length() + " letters.");
                System.out.println("Hint: The word starts with the letter '" + playerInput1.substring(0,1) + "'.");
                System.out.println("Hint: The word ends with the letter '" + playerInput1.substring(playerInput1.length() - 1) + "'.");
            }
            if (count >= 11 && count <17){
                System.out.println("Hint: The word has " + playerInput1.length() + " letters.");
                System.out.println("Hint: The word starts with the letter '" + playerInput1.substring(0,1) + "'.");
                System.out.println("Hint: The word ends with the letter '" + playerInput1.substring(playerInput1.length() - 1) + "'.");
                System.out.println("Hint: The word's second letter is '" + playerInput1.substring(1,2) + "'.");
            }
            if (count >= 17){
                System.out.println("Hint: The word has " + playerInput1.length() + " letters.");
                System.out.println("Hint: The word starts with the letter '" + playerInput1.substring(0,1) + "'.");
                System.out.println("Hint: The word ends with the letter '" + playerInput1.substring(playerInput1.length() - 1) + "'.");
                System.out.println("Hint: The word's second letter is '" + playerInput1.substring(1,2) + "'.");
                System.out.println("Hint: The word's second to last letter is '" + playerInput1.substring(playerInput1.length() - 2, playerInput1.length() - 1)+ "'.") ;
            }
            if (count == 30 || playerInput2.equals("give up")){
                System.out.println("The word was too hard for you. You could not guess the word. The word was: " + playerInput1);
                System.out.println("You have taken " + count + " tries.");
                one = false;
            }
        }
        /*
        while (true) {
            System.out.println("Please enter which fibonacci term you want to know.");
            System.out.println("Type in another fibonacci term if you want to know another one. Or else type in 'end'.");
            String end = input.nextLine();
            if (end.equals("end")){
                break;
            }
            int userFibonacci = Integer.parseInt(end);
            int fibonacciTerms[] = new int[userFibonacci];
            fibonacciTerms[0] = 1;
            fibonacciTerms[1] = 1;
            for (int i = 2; i < fibonacciTerms.length; i++) {
                fibonacciTerms[i] = fibonacciTerms[i - 1] + fibonacciTerms[i - 2];
            }
            System.out.println(fibonacciTerms[userFibonacci - 1]);

        String character = input.nextLine();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(character);
            }
            System.out.println("");
        }



            System.out.println("Insert size:");
            int arraySize = input.nextInt();
            System.out.println("Now insert you number of elements:");
            int[] array = new int[arraySize];
            int count = -1;
            int sum = 0;
            while (count < arraySize-1) {
                int addArray = input.nextInt();
                count++;
                array[count] = addArray;
                sum += addArray;
            }
            System.out.print("Non-Sorted Array:");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + " ");
            }

            bubbleSortJava(array);
            System.out.println();
            System.out.print("Sorted Array:");
            for (int i = 0; i < arraySize; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            float averageArray= (float)sum/arraySize;
            System.out.print("The mean of the array:");
            System.out.println(averageArray);
            float medianArray = 0;
            if (arraySize%2 == 0){
                medianArray = (float)(array[arraySize/2 -1] + array[arraySize/2])/ 2;
            }else{
                medianArray = array[arraySize/2];
            }
            System.out.print("The median of the array:");
            System.out.println(medianArray);

 */

        }

}
