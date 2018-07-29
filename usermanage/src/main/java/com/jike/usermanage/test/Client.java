package com.jike.usermanage.test;

import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import com.jike.usermanage.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Client {
    public static void testList(UserService userService) {
        List<User> users = userService.getUsers();
        if (users != null) {
            for (User user : users) {
                System.out.println(user);
            }
        }
    }

    public static void testAddUser(UserService userService) {
        User user = new User();
        user.setAddress("天河路120号");
        user.setName("小徐");
        user.setPhone("15155556666");
        userService.addUser(user);
        testList(userService);
    }


    public static void testUpdateUser(UserService userService) throws UserNotFound {
        User user = new User();
        user.setId(1);
        user.setAddress("北京路121号");
        userService.updateUser(user);
        testList(userService);
    }

    public static void testDeleteUser(UserService userService) throws UserNotFound {
        userService.deleteUser(6);
        testList(userService);

    }

    public static void testGetUser(UserService userService) {

    }

    public static void main(String[] args) throws UserNotFound {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        testDeleteUser(userService);
    }
}
