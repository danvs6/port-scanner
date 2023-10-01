package scanner.port;

import java.net.Socket;
import java.io.IOException;

public class ScanPorts {
    private String targetHost;
    private int startPort;
    private int endPort;

    public ScanPorts(String targetHost, int startPort, int endPort) // ScanPorts constructor
    {
        this.targetHost = targetHost;
        this.startPort = startPort;
        this.endPort = endPort;
    }


}
