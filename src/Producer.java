import java.util.Random;

public class Producer implements Runnable {

    private Diamanter diamanter;

    public Producer(Diamanter diamanter) {
        this.diamanter = diamanter;
    }

    @Override
    public void run() {
        while(true){
            diamanter.inc();
            System.out.println("Har tilføjet en diamant");
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(1000));
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
