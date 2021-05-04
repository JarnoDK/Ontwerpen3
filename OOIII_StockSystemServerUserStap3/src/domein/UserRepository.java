package domein;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    Map<String, User> users;

    public UserRepository() {
        users = new HashMap<>();
        users.put("Jan", new User("Jan", false));
        users.put("Piet", new User("Piet", false));
        users.put("Admin1", new User("Admin1", true));
        users.put("Admin2", new User("Admin2", true));
    }

    public User getUser(String username) {
        return users.get(username);
    }

    Collection<User> getUsers() {
        return Collections.unmodifiableCollection(users.values());
    }
}