package com.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @description:
 * @author: freemarker
 * @create: 2020-04-14 09:39
 **/
/**
 * @RestController:  表示修饰该Controller所有的方法返回JSON格式,直接可以编写
 * @EnableAutoConfiguration注解:作用在于让 Spring Boot   根据应用所声明的依赖来对 Spring 框架进行自动配置
 这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。由于spring-boot-starter-web添加了Tomcat和Spring MVC，
 所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
  */
@Controller
@RequestMapping("/ftl")
public class FtlController {
    @RequestMapping("/index")
    public  String index(Map<String,Object> map){
        map.put("name", "lisi");
        return "freemarker/test";
    }
}
