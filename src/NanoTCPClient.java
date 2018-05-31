import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class NanoTCPClient {
    public static void main(String[] args) {
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            Socket socket = new Socket(ip, 5555);

            BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream, true);

            Chat.startChat(keyRead, bufferedReader, printWriter);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


}
