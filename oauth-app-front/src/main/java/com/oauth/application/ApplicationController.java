package com.oauth.application;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Controller
public class ApplicationController {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";

    @GetMapping("/application")
    public String viewApplicationList(Model model, HttpServletRequest request) {

        String bearerToken = request.getHeader(AUTHORIZATION_HEADER);
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith(BEARER_PREFIX)) {
            model.addAttribute("accessToken", bearerToken.substring(7));
        }

        return "application/list";
    }

    @GetMapping("/application/{name}")
    public String viewApplicationDetail(Model model, @PathVariable("name") String name) {
        model.addAttribute("name", name);
        return "application/detail";
    }
}
