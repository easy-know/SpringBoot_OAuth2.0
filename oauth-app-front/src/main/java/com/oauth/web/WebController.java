package com.oauth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description : 컨트롤러
 *
 * @author leejinho
 * @version 1.0
 */
@Controller
public class WebController {
    @GetMapping("sign-up")
    public String signUp() {
        return "member/sign-up";
    }

    @GetMapping("sign-in")
    public String signIn() {
        return "member/sign-in";
    }
}
