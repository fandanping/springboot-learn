package com.springjpa.source2;

import com.springjpa.source2.dao.UserDao2;
import com.springjpa.source2.domain.UserEntity2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 16:38
 **/
public class controller {
    /**
     * @description:
     * @author: fandp
     * @create: 2020-04-14 14:17
     **/
    @RestController
    @RequestMapping("/blog")
    public static class IndexController2 {
        private static final Logger logger = LoggerFactory.getLogger(IndexController2.class);
        @Autowired
        private UserDao2 userDao;
        @RequestMapping("/getUsers")
        public List<UserEntity2> getUsers(){
            logger.info("hahahahahaha");
            return  userDao.findAll();
        }
    }
}
