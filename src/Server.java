import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {

        int client = 1;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Сервер запущен...");
        while(true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("client accepted " + (client ++));
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            writer.write("Java");

            writer.flush();

            writer.close();
            clientSocket.close();
        }

        //   serverSocket.close();

    }
}
