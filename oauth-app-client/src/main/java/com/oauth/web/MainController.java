package com.oauth.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Controller
public class MainController {
    @GetMapping("/")
    public String mainView() {
        return "main";
    }
}
