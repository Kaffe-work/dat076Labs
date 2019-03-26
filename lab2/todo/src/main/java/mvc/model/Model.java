package mvc.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Singleton to access the model parts of application
 *
 * @author hajo
 */

public enum Model {
    INSTANCE;
    private static final Logger LOG = Logger.getAnonymousLogger();
        private static final Level I = Level.INFO;
    private final TodoList list = new TodoList();
    private final UserRegistry reg = new UserRegistry();

    public TodoList getList() {
        
        return list;
    }

    public UserRegistry getUserRegistry() {
        return reg;
    }

    public User login(String email, String passwd) {

        LOG.log(I, email + "; " + passwd);
        
        return reg.login(email, passwd);
    }

    public User register(String name, String password, String email) {
        User user = new User(name,password,email);
        reg.register(user);
        return user;
    }

    // TODO Other methods called by new actions
}
