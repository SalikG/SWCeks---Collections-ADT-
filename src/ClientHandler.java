import java.net.Socket;
import java.util.Scanner;

public class ClientHandler implements Runnable{
    private Socket socket;
    private MultiChatServer multiChatServer;
    public ClientHandler(Socket socket, MultiChatServer multiChatServer){
        this.multiChatServer = multiChatServer;
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            String message = "";
            while(true){
                message = scanner.nextLine();
                multiChatServer.sendToAll(message);
                Thread.sleep(200);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
