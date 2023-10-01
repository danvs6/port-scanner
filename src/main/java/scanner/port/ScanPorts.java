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

        System.out.println("Scanning started on " + date.SetDateTime(dateTimeFormat,todaysdate));

        for (int port = startPort; port <= endPort; port++)
        {
            try
            {
                Socket socket = new Socket();
                SocketAddress socketAddress = new InetSocketAddress(targetHost,port);
                socket.connect(socketAddress,5000); // 5 second timeout
                System.out.println("Port " + port + " is open");
                socket.close();
            }
            catch(IOException e)
            {
                System.out.println("Port " + port + " is closed");
            }

        }

        System.out.println("Port Scanning Completed");
    }
}
