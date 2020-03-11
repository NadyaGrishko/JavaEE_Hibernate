package workers;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkWithUser{

    @Autowired
    private UserDao usersDao;

    public void saveToDB(User user) {
        if ((user != null) && (user.getPib() != null) && (!user.getPib().equals("")) && (user.getCourse() > 0)) {
            usersDao.addUser(user);
            System.out.println("User have been saved " + user);
        }
    }
}