import java.util.Scanner;
public class TicTacToe {
    public static void printArray(String[][] tt){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tt[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args){
        System.out.println("Welcome to the game Tic Tac Toe. Player One is the circle and Player Two is the cross.");
        System.out.println("To type in your position, you have to type in row,column. For example, typing in 1,3 would put you in the top right position.");
        System.out.println("Also don't type in a position that has already been used. Have fun playing the game :)");
        Scanner input  = new Scanner(System.in);
        String TicTacToe [][]= new String [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            TicTacToe[i][j] = "_";
        }
    }
        int move = 0;
    boolean userMove = true;
        while (true){
        String TicTacToeSquare = input.nextLine();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(TicTacToeSquare.equals((i + 1) + ", " + (j + 1)) || TicTacToeSquare.equals((i + 1) + "," + (j + 1))){
                    if(TicTacToe[i][j].equals("_"))
                        if(userMove){
                            TicTacToe[i][j] = "O";
                            userMove = false;
                        }else{
                            TicTacToe[i][j] = "X";
                            userMove = true;
                            }
                    else{
                        System.out.println("That spot is taken. Try again.");
                        move--;
                        if(userMove){
                            TicTacToe[i][j] = "X";
                            userMove = true;
                        }else{
                            TicTacToe[i][j] = "O";
                            userMove = false;
                        }
                    }
                    }

                }
            }
        move++;
        printArray(TicTacToe);
            if (TicTacToe[0][0].equals("O") && TicTacToe[1][1].equals("O") && TicTacToe[2][2].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][0].equals("X") && TicTacToe[1][1].equals("X") && TicTacToe[2][2].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][2].equals("X") && TicTacToe[1][1].equals("X") && TicTacToe[2][0].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][2].equals("O") && TicTacToe[1][1].equals("O") && TicTacToe[2][0].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][0].equals("X") && TicTacToe[0][1].equals("X") && TicTacToe[0][2].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][0].equals("O") && TicTacToe[0][1].equals("O") && TicTacToe[0][2].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[1][0].equals("X") && TicTacToe[1][1].equals("X") && TicTacToe[1][2].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[1][0].equals("O") && TicTacToe[1][1].equals("O") && TicTacToe[1][2].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[2][0].equals("X") && TicTacToe[2][1].equals("X") && TicTacToe[2][2].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[2][0].equals("O") && TicTacToe[2][1].equals("O") && TicTacToe[2][2].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][0].equals("X") && TicTacToe[1][0].equals("X") && TicTacToe[2][0].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][0].equals("O") && TicTacToe[1][0].equals("O") && TicTacToe[2][0].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][1].equals("X") && TicTacToe[1][1].equals("X") && TicTacToe[2][1].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][1].equals("O") && TicTacToe[1][1].equals("O") && TicTacToe[2][1].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][2].equals("X") && TicTacToe[1][2].equals("X") && TicTacToe[2][2].equals("X")){
                System.out.println("Player Two, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(TicTacToe[0][2].equals("O") && TicTacToe[1][2].equals("O") && TicTacToe[2][2].equals("O")){
                System.out.println("Player One, you WIN!! CONGRATULATIONS!!!!");
                break;
            }
            else if(move == 9){
                System.out.println("Tie Game! Good Job both of you.");
                break;
            }
            else {
            }
        }
    }
}
