package com.yuezhi.app.my_yuezhi.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {

    private Integer id;

    private String phonr;

    private String username;

    private String password;

    private String picutre;

    private String[] tag;

}
