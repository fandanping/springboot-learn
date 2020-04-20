package com.springjpa.source1;

import com.springjpa.source1.dao.UserDao;
import com.springjpa.source1.domain.UserEntity;
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
    @RequestMapping("/user")
    public static class IndexController {
        private static final Logger logger = LoggerFactory.getLogger(IndexController.class);
        @Autowired
        private UserDao userDao;
        @RequestMapping("/getUsers")
        public List<UserEntity> getUsers(){
            logger.info("33");
            return  userDao.findAll();
        }
    }
}
