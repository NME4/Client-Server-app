import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{
    Socket clientSocket = new Socket("127.0.0.1", 8000);
    clientSocket.close();
    }
}