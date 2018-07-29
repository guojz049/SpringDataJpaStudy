package com.jike.usermanage.repository;

import com.jike.usermanage.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    //查询需求：从数据库中查询电话号码(phone)以指定字符串开始(如136)，并且地址(address)中包含指定的字符串(如:路)的记录
    //select * from `user` where phone like '136%' and address like '%路%' order by phone DESC limit 0,2
    List<User> findTop2ByPhoneStartingWithAndAddressContainingOrderByPhoneDesc(String phone, String address);

    List<User> findTop2ByPhoneStartingWithAndAddressContaining(String phone, String address, Sort sort);

    Page<User> findTop2ByPhoneStartingWithAndAddressContaining(String phone, String address, Pageable pageable);

}
