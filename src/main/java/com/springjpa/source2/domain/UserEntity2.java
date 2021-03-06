package com.springjpa.source2.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @description:
 * @author: fandp
 * @create: 2020-04-14 14:00
 **/
@Entity(name="user")
@Data
public class UserEntity2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String   id;
    @Column(name= "username")
    private String  username;
    @Column(name= "password")
    private String password;
}
