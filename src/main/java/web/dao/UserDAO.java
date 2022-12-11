package web.dao;

import web.model.User;
import java.util.List;

public interface UserDAO {
    List<User> index();

    void save(User user);

    void delete(long id);

    User show(long id);

    void update(User user);
}
