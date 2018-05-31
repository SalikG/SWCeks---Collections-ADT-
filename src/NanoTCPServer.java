import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class NanoTCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5555);
            Socket socket = serverSocket.accept();

            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            Chat.startChat(keyRead, bufferedReader, printWriter);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
