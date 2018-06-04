interface Inter{
    void show();
}

// 1. måde
class A implements Inter{
    @Override
    public void show() {
        System.out.println("implementering i en klasse");
    }
}
public class MainClass {


    public static void main(String[] args) {
        Inter obj;

        // 1. måde
        obj = new A();
        obj.show();


        // 2. måde
        obj = new Inter() {
            @Override
            public void show() {
                System.out.println("bla bla");
            }
        };
        obj.show();


        // 3. måde

//        obj = () -> {
//            System.out.println("lambda");
//        };

        obj = () -> System.out.println("lambda");

        obj.show();
    }
}
