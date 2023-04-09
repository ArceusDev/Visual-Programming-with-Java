package Main;

import java.util.Scanner;


public class Event {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        char isRepeat; 
        
        do {
            System.out.print("Enter the first letter of Direction you want to head: ");
            char input = in.next().toUpperCase().charAt(0);
            
            if (input == 'W') {
                System.out.println("You are heading West.");
            }
            else if (input == 'E') {
                System.out.println("You are heading East.");
            }
            else if (input == 'S') {
                System.out.println("You are heading South.");
            }
            else if (input == 'N') {
                System.out.println("You are heading North.");
            }
            else {
                System.out.println("Invalid Direction!");
            }
            
            System.out.print("Would you like to start again? (Y/N): ");
            isRepeat = in.next().toUpperCase().charAt(0);
            
        } while (isRepeat == 'Y');
    }
}
