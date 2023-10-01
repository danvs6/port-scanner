package scanner.port;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.io.IOException;
import java.net.SocketAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScanPorts {

    public void beginPortScan(String targetHost, int startPort, int endPort)
    {
        DateTime date = new DateTime();
        DateTimeFormatter dateTimeFormat = date.dateTimeFormat;
        LocalDateTime todaysdate = date.todaysDate;

        System.out.println("Scanning started on " + date.SetDateTime(dateTimeFormat,todaysdate)); // print current date and time

        for (int port = startPort; port <= endPort; port++) // from the starting port till the ending port
        {
            try
            {
                Socket socket = new Socket(); // create a new socket
                SocketAddress socketAddress = new InetSocketAddress(targetHost,port); // create the socket address with the target host and port
                socket.connect(socketAddress,5000); // connect the socket using the socket address with a 5-second timeout
                System.out.println("Port " + port + " is open"); // print if the port is open
                socket.close(); // close the port afterwards
            }
            catch(IOException e)
            {
                System.out.println("Port " + port + " is closed"); // print if the port is closed
            }

        }

        System.out.println("Port Scanning Completed"); // print after port scanning is completed
    }
}
