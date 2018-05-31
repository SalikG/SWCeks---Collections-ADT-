import java.io.BufferedReader;
import java.io.PrintWriter;

public class Chat {
    public static void startChat(BufferedReader keyRead, BufferedReader bufferedReader, PrintWriter printWriter){
        try {
            while (true) {
                if (keyRead.ready()) {
                    printWriter.println(keyRead.readLine());
                }
                if (bufferedReader.ready()) {
                    System.out.println(bufferedReader.readLine());
                }
                Thread.sleep(200);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
