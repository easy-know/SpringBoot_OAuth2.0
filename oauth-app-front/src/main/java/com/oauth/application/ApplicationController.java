package com.oauth.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Controller
public class ApplicationController {

    @GetMapping("/application")
    public String viewApplication() {
        return "application/list";
    }
}
