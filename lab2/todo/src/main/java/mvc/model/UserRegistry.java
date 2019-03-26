package mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * A user registry
 *
 *  *** Nothing to do here *****
 *
 *
 * @author hajo
 */
public class UserRegistry {

    private final List<User> users = new ArrayList();

    public UserRegistry() {
        users.add(new User("Anonymous", "anon", "anon@anon"));
    }

    public boolean register(User user) {
        if (!users.contains(user)) {
            return users.add(user);
        }
        return false;
    }
    
    /**
     * A login function that doesn't need name
     * @param user
     * @return 
     */
    public User login(String email, String password){
        for(int i = 0; i < users.size(); i++){
            User user = users.get(i);
            if(user.getEmail().equals(email) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public User lookup(User user) {
        if (users.contains(user)) {
            return users.get(users.indexOf(user));
        }
        return null;
    }

    public int size() {
        return users.size();
    }

}
