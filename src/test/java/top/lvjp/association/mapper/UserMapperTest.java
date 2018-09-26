package top.lvjp.association.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.lvjp.association.entity.User;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    private final Logger logger = LoggerFactory.getLogger(UserMapperTest.class);

    @Test
    public void selectUserByName() {
        Assert.assertEquals(new Integer(1),userMapper.selectUserByName("root").getUserId());
    }

    @Test
    public void selectUserById() {
        Assert.assertEquals("root",userMapper.selectUserById(1).getUserName());
    }

    @Test
    public void selectUser() {
        List<User> users = userMapper.selectUser();
        for (User user: users) {
            logger.info(user.toString());
        }
        Assert.assertEquals(3,users.size());
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setUserName("user1");
        user.setUserPassword("345678");
        user.setUserType(2);
        Assert.assertEquals(1,userMapper.insertUser(user));
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setUserId(3);
        user.setUserName("user");
        user.setUserPassword("345678");
        user.setUserType(2);
        Assert.assertEquals(1,userMapper.updateUser(user));
    }

    @Test
    public void deleteUserById(){
        Assert.assertEquals(1,userMapper.deleteUserById(5));
    }
}