package scanner.port;

public class InputPorts {

    private String targetHost;
    private int startPort;
    private int endPort;

    public InputPorts(String targetHost, int startPort, int endPort){
        this.targetHost = targetHost;
        this.startPort = startPort;
        this.endPort = endPort;
    }
}
