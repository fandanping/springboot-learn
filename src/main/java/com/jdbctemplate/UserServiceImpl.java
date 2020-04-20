package com.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 10:52
 **/
@RestController
public class UserServiceImpl {
    @Autowired
   private JdbcTemplate jdbcTemplate;
   @RequestMapping("addUser")
   public void createUser(String name, String age){
       jdbcTemplate.update("insert into user(username,password,id) values(?,?,12);", name, age);
   }
}
