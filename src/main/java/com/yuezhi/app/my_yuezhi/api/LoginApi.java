package com.yuezhi.app.my_yuezhi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/login")
public class LoginApi {

    @GetMapping("/phone/in")
    public static void login(@RequestParam String phone){


    }

}
