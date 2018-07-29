package com.jike.usermanage.service;

import com.jike.usermanage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.List;

@Test
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private UserService userService;


    @Test
    public void testAddUser() throws Exception {
    }

    @Test
    public void testUpdateUser() throws Exception {
    }

    @Test
    public void testDeleteUser() throws Exception {
    }

    @Test
    public void testGetUser() throws Exception {
    }

    @Test
    public void testGetUsers() throws Exception {
        List<User> users = userService.getUsers();
        if (users != null) {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}