
package Metodo_HashCode;

import java.util.HashMap;
import java.util.Map;

public class UserApp {
    public static void main(String[] args) {
        Map<User, User> users = new HashMap<>();
        User user1 = new User(1, "John999@gmail.com", "John");
        User user2 = new User(2, "Jeniffer@gmail.com", "Jeniffer");
        User user3 = new User(3, "Mary@gmail.com", "Mary");
        
        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);
        
        System.out.println("Hashcome de user1: " + user1.hashCode());
        System.out.println("Hashcome de user2: " + user2.hashCode());
        System.out.println("Hashcome de user3: " + user3.hashCode());
    }
}
