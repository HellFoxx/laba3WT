package hellfoxx.server.DataAccessLayer.UserDao;

import java.util.ArrayList;
import hellfoxx.models.User;

public interface IUserDao {
	
	Boolean delete(String login);
    Boolean save(User user);
    User getAuthorizeUser(String login, String password);
    ArrayList<User> getUsers();
}
