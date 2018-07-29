package com.jike.usermanage.service;

import com.jike.usermanage.exception.UserNotFound;
import com.jike.usermanage.model.User;
import com.jike.usermanage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User updateUser(User user) throws UserNotFound {
        User userUpdate = userRepository.findOne(user.getId());
        if(userUpdate == null) {
            throw new UserNotFound();
        }
        if(user.getName() != null) {
            userUpdate.setName(user.getName());
        }
        if(user.getAddress() != null) {
            userUpdate.setAddress(user.getAddress());
        }
        if(user.getPhone() != null) {
            userUpdate.setPhone(user.getPhone());
        }
        userRepository.save(userUpdate);
        return userUpdate;
    }

    public User deleteUser(int id) throws UserNotFound {
        User userDelete = userRepository.findOne(id);
        if(userDelete == null) {
            throw new UserNotFound();
        }
        userRepository.delete(userDelete);
        return userDelete;
    }

    public User getUser(int id) {
        return userRepository.findOne(id);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public List<User> getUsersByConditionNoPage(String phone, String address) {
//        return userRepository.findTop2ByPhoneStartingWithAndAddressContainingOrderByPhoneDesc(phone, address);
//        return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(Sort.Direction.ASC,"phone"));
        List<Sort.Order> orders = new ArrayList<Sort.Order>();
        orders.add(new Sort.Order(Sort.Direction.DESC,"name"));
        orders.add(new Sort.Order(Sort.Direction.ASC,"phone"));
        return userRepository.findTop2ByPhoneStartingWithAndAddressContaining(phone, address, new Sort(orders));


    }

    public Page<User> getUsersByConditionWithPage(String phone, String address, Integer page, Integer pageSize) {
        return null;
    }
}
