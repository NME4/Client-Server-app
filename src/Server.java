import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Server {
    public static void main(String[] args) throws IOException {

        int client = 1;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Сервер запущен...");
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("client accepted " + (++client));
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());

            //___________________________Читалка______________________________
            BufferedReader breader = new BufferedReader(
                    new InputStreamReader(
                            clientSocket.getInputStream()));

            String request = breader.readLine();
            String response = "Yuour message length is " + request.length() + "\n";

            writer.write(response);
            writer.flush();

            //___________________________Закрывашки_____________________________
            breader.close();
            writer.close();
            clientSocket.close();
        }

        //   serverSocket.close();

    }
}
