package com.springjpa.source1.dao;

import com.springjpa.source1.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 14:16
 **/
public interface UserDao  extends JpaRepository<UserEntity,String>{
}
