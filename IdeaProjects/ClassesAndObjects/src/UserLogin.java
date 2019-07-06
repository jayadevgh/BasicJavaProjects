import java.util.Scanner;
public class UserLogin {
    public static void printArray(String[][] tt){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tt[i][j] + " ");
            }
            System.out.println();
        }
    }
    static class UserInfo {
        String email;
        String firstName;
        String lastName;
        String username;
        int age;
        String password;
        String birthday;
        long phoneNumber;
        double cashAmount;

        public double getCashAmount() {
            return cashAmount;

        }

        public String getFirstName() {
            return firstName;

        }

        public int getAge() {
            return age;
        }

        public String getBirthday() {
            return birthday;

        }

        public long getPhoneNumber() {
            return phoneNumber;

        }

        public String getLastName() {
            return lastName;

        }

        public String getEmail(){
            return email;
        }
        public void setCashAmount(double cash) {
            this.cashAmount = cash;

        }

        public void setFirstName(String name) {
            this.firstName = name;

        }

        public void setAge(int age) {
            this.age = age;

        }

        public void setBirthday(String birth) {
            this.birthday = birth;

        }

        public void setPhoneNumber(long phoneNum) {
            this.phoneNumber = phoneNum;

        }

        public void setLastName(String LastName) {
            this.lastName = LastName;

        }

        public void setPassword(String Password) {
            this.password = Password;

        }

        public void setUserName(String UserName) {
            this.username = UserName;

        }

        public void setEmail(String email) {
            this.email = email;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Scanner input3 = new Scanner(System.in);
        int count=0;
        UserInfo user1 = new UserInfo();

        while(true){
        System.out.println("Welcome to National Storage where you can store personal information online.");
        System.out.println("Would you like to login or register? Type in 'login' or 'register'");

        String startingScreen = input.nextLine();


        if (startingScreen.equals("register")) {
            count++;
            System.out.println("What is your first name?");
            String firstName = input.nextLine();
            user1.setFirstName(firstName);
            System.out.println("What is your last name?");
            String lastName = input.nextLine();
            user1.setLastName(lastName);
            System.out.println("How old are you?");
            int age = input.nextInt();
            user1.setAge(age);
            System.out.println("What is your date of birth?");
            String birthDate = input2.nextLine();
            user1.setBirthday(birthDate);
            System.out.println("What is you phone number?");
            long phoneNumber = input.nextLong();
            user1.setPhoneNumber(phoneNumber);
            System.out.println("What is your email?");
            String EMail = input2.nextLine();
            user1.setEmail(EMail);
            System.out.println("How much cash do you have?");
            double cashAmount = input.nextDouble();
            user1.setCashAmount(cashAmount);
            String username;
            if (firstName.length() >= 6) {
                username = firstName.substring(0, 5) + "NewStorage";
            } else if (firstName.length() >= 3) {
                username = firstName.substring(0, 3) + "NewStore";
            } else {
                username = firstName + "New_Store";
            }
            System.out.println("Here is your username: " + username);
            user1.setUserName(username);
            System.out.println("Enter in a password:");
            String password = input2.nextLine();
            user1.setPassword(password);
        } else if (startingScreen.equals("login") && count >0) {
            System.out.println("Enter your username:");
            String userName = input.nextLine();
            if (userName.equals(user1.username)){
                System.out.println("Enter your password:");
                String pass = input.nextLine();
                if(pass.equals(user1.password)){
                    System.out.println("Account details:");
                    System.out.println("First Name:");
                    System.out.println(user1.getFirstName());
                    System.out.println("Last Name:");
                    System.out.println(user1.getLastName());
                    System.out.println("Age:");
                    System.out.println(user1.getAge());
                    System.out.println("Birthday:");
                    System.out.println(user1.getBirthday());
                    System.out.println("Phone Number:");
                    System.out.println(user1.getPhoneNumber());
                    System.out.println("Email:");
                    System.out.println(user1.getEmail());
                    System.out.println("Cash Amount:");
                    System.out.println(user1.getCashAmount());
                }else{
                    System.out.println("Incorrect Password. You can still access your information by entering your email.");
                    String Email = input.nextLine();
                    if(Email.equals(user1.email)){
                        System.out.println("Now enter your phone number.");
                        long phone = input.nextLong();
                        if(phone == user1.phoneNumber) {
                            System.out.println("Account details:");
                            System.out.println("First Name:");
                            System.out.println(user1.getFirstName());
                            System.out.println("Last Name:");
                            System.out.println(user1.getLastName());
                            System.out.println("Age:");
                            System.out.println(user1.getAge());
                            System.out.println("Birthday:");
                            System.out.println(user1.getBirthday());
                            System.out.println("Phone Number:");
                            System.out.println(user1.getPhoneNumber());
                            System.out.println("Email:");
                            System.out.println(user1.getEmail());
                            System.out.println("Cash Amount:");
                            System.out.println(user1.getCashAmount());
                            System.out.println("Would you like to play Tic Tac Toe?");
                            String TicTac = input3.nextLine();
                            if(TicTac.equals("yes")){
                                System.out.println("Welcome to the game Tic Tac Toe. Player One is the circle and Player Two is the cross.");
                                System.out.println("To type in your position, you have to type in row,column. For example, typing in 1,3 would put you in the top right position.");
                                System.out.println("Also don't type in a position that has already been used. Have fun playing the game :)");
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
                                        continue;
                                    }
                                }
                            }
                        }else{
                            System.out.println("Incorrect Phone Number");
                            }
                    }else{
                        System.out.println("Incorrect Email");
                    }
                }
            }else{
                System.out.println("Username not found.");
            }
        } else{
            System.out.println("You have misspelled a word or you haven't registered yet. Remember, type it in lowercase.");
        }
    }
    }
}
