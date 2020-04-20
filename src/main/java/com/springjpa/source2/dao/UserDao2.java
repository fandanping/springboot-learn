package com.springjpa.source2.dao;

import com.springjpa.source2.domain.UserEntity2;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 14:16
 **/
public interface UserDao2 extends JpaRepository<UserEntity2,String>{
}
