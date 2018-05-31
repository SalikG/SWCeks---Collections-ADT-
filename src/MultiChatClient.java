import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MultiChatClient {

    public static void main(String[] args){
        try{
            InetAddress inetAddress = InetAddress.getByName("localhost");
            Socket socket = new Socket(inetAddress, 6780); //local connection
//            Socket socket = new Socket("192.168.0.2", 6780);
            System.out.println("Connection established");
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader buffServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader buffKey = new BufferedReader(new InputStreamReader(System.in));
            while (true){
                if(buffServer.ready()){
                    System.out.println("From server: " + buffServer.readLine());
                }
                if(buffKey.ready()){
                    printWriter.println(buffKey.readLine());
                }
                Thread.sleep(200);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
