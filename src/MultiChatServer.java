import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class MultiChatServer {
    private Map<Socket, PrintWriter> socketsMap = new HashMap<>();
    public static void main(String[] args){
        MultiChatServer multiChatServer = new MultiChatServer();
    }

    public MultiChatServer(){
        try {
            ServerSocket serverSocket = new ServerSocket(6780);
            System.out.println("Ready for new Client");
            while (true){
                Socket socket = serverSocket.accept(); //blokere og venter på en client som den kan acceptere
                System.out.println("Connection established");
                socketsMap.put(socket, new PrintWriter(socket.getOutputStream(), true));
                ClientHandler clientHandler = new ClientHandler(socket, this);
                Thread thread = new Thread(clientHandler); //en ny seperat proces som kører uafhængig af main thread
                thread.start(); //starter en thread
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void sendToAll(String message){
        for (Map.Entry<Socket, PrintWriter> entry : socketsMap.entrySet()) {
            entry.getValue().println(message);
        }
    }
}
