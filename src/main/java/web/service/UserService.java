package web.service;

import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    List<User> index();

    void save(User user);

    void delete(long id);

    User show(long id);

    void update(User user);
}
