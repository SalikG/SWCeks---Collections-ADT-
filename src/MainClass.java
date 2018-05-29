import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args){
        Role admin = new Role("admin");
        Role secretary = new Role("secretary");
        Role sales = new Role("sales");
        Role normalUser = new Role("normal user");


        User user1 = new User("Jens", 1111, new ArrayList<Role>(){{add(normalUser);}});
        User user2 = new User("Peter", 1234, new ArrayList<Role>(){{add(sales); add(secretary);}});
        User user3 = new User("Karlos", 3333, new ArrayList<Role>(){{add(sales);}});
        User user4 = new User("Hans", 2346, new ArrayList<Role>(){{add(admin);}});

        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        try {
            int counter = 1;
            for (User u : users) {
                System.out.print("User " + counter + " == ");
                System.out.print("Roles: ");
                if (u.getRoles().contains(sales)) {
                    System.out.print("sales   ");
                }
                Thread.sleep(700);
                if (u.getRoles().contains(admin)) {
                    System.out.print("admin   ");
                }
                Thread.sleep(700);
                if (u.getRoles().contains(secretary)) {
                    System.out.print("secretary   ");
                }
                Thread.sleep(700);
                if (u.getRoles().contains(normalUser)) {
                    System.out.print("normal user   ");
                }
                Thread.sleep(700);
                System.out.println();
                counter++;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
