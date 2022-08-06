import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket = new Socket("127.0.0.1", 8000);

        OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
        writer.write("Get me some information\n");
        writer.flush();

        //________________________________________________________________

        BufferedReader breader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String response = breader.readLine();
        System.out.println(response);

        //_____________________Закрывашки________________________________
        writer.close();
        breader.close();
        clientSocket.close();
    }
}
