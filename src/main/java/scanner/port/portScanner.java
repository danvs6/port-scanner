package scanner.port;

import java.util.Scanner;

public class portScanner {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a target host (IP address or domain name): ");
        String targetHost = userInput.nextLine(); // takes in a target host

        System.out.println("Enter a starting port: ");
        int startPort = userInput.nextInt(); // takes in a starting port

        System.out.println("Enter an ending port: ");
        int endPort = userInput.nextInt(); // takes in an ending port

        new ScanPorts().beginPortScan(targetHost,startPort,endPort); // use the target host, starting and ending ports to scan ports

    }

}