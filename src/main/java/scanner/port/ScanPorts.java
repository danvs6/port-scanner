package scanner.port;

import java.net.Socket;
import java.io.IOException;
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
                Socket socket = new Socket(targetHost, port);
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
