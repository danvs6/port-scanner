package scanner.port;

import java.util.Scanner;

public class portScanner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a target host (IP address or domain name): ");
        String targetHost = userInput.nextLine();

        System.out.println("Enter a starting port: ");
        int startPort = userInput.nextInt();

        System.out.println("Enter an ending port: ");
        int endPort = userInput.nextInt();



    }

}