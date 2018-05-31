public class Diamanter {

    private int count = 0;

    public synchronized void inc(){
        try {
            if (count >= 5) {
                wait();
            }
            count = count + 1;
            System.out.print("inc: "+count + " ");
            notifyAll();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public synchronized void dec(){
        try {
            if (count <= 0) {
                wait();
            }
            count = count - 1;
            System.out.print("dec: "+count + " ");
            notifyAll();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
