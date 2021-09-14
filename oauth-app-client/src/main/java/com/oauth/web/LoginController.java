package com.oauth.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login/gsitm")
    public String viewLogin() {
        return "login";
    }
}
