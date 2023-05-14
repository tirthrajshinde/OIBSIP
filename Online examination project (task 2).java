import java.util.Scanner;

public class Main {

    private static String username = "raj";
    private static String password = "r3";
    private static int timer = 0;
    private static boolean isLoggedIn = false;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the MCQ test!");
        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Select Answers for MCQs");
            System.out.println("4. Timer and Auto Submit");
            System.out.println("5. Close Session and Logout");
            System.out.println("0. Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    login(scanner);
                    break;
                case 2:
                    updateProfile(scanner);
                    break;
                case 3:
                    selectAnswers(scanner);
                    break;
                case 4:
                    timerAndAutoSubmit(scanner);
                    break;
                case 5:
                    closeSession();
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }

    private static void login(Scanner scanner) {
        if (isLoggedIn) {
            System.out.println("You are already logged in!");
            return;
        }
        System.out.println("Please enter your username:");
        String inputUsername = scanner.next();
        System.out.println("Please enter your password:");
        String inputPassword = scanner.next();
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            isLoggedIn = true;
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    
    private static void updateProfile(Scanner scanner) {
        if (!isLoggedIn) {
            System.out.println("You need to login first!");
            return;
        }
        System.out.println("Please enter your new username:");
        String newUsername = scanner.next();
        System.out.println("Please enter your new password:");
        String newPassword = scanner.next();
        username = newUsername;
        password = newPassword;
        System.out.println("Profile and password updated successfully!");
    }
    
    private static void selectAnswers(Scanner scanner) {
        if (!isLoggedIn) {
            System.out.println("You need to login first!");
            return;
        }
        System.out.println("Please select your answers for the MCQs.");
        
    }
    
    private static void timerAndAutoSubmit(Scanner scanner) {
        if (!isLoggedIn) {
            System.out.println("You need to login first!");
            return;
        }
        System.out.println("Please enter the timer duration (in minutes):");
        timer = scanner.nextInt();
        
    }
    
    private static void closeSession() {
        if (!isLoggedIn) {
            System.out.println("You need to login first!");
            return;
        }
        isLoggedIn = false;
        timer = 0;
        System.out.println("Session closed and logged out successfully!");
    }
}
