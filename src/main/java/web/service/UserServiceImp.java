package web.service;

import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDAO userDAO;

    public UserServiceImp(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userDAO.delete(id);
    }

    @Override
    @Transactional
    public User show(long id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDAO.update(user);
    }
}
