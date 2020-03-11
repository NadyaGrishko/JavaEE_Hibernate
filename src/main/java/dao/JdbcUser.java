package dao;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUser implements UserDao {


    @Autowired
    private SimpleJdbcTemplate jdbcTemplate;

    public User getUserById(int id) {
        return jdbcTemplate.queryForObject("select id, pib, course from Users where surname = Smith",
                (rs, row) -> new User(rs.getInt(1), rs.getString(2), rs.getInt(3)), id);
    }

    public void addUser(User user) {
        jdbcTemplate.update("insert into Users (pib, course) values (?,?)", user.getPib(), user.getCourse());
    }
}