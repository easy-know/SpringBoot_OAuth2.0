package com.oauth.login;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * Description : 컨트롤러
 *
 * @author leejinho
 * @version 1.0
 */
@Slf4j
@Controller
public class LoginController {
    @GetMapping("sign-up")
    public String signUp() {
        return "member/sign-up";
    }

    @GetMapping("sign-in")
    public String signIn() {
        return "member/sign-in";
    }

    @GetMapping("gsitm-login")
    public String mainView() {
        return "login/gsitm-login";
    }

    @GetMapping("login")
    public String redirectLoginGsitm(HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes) {
        String referer = httpServletRequest.getHeader("referer");
        log.info(referer);

        redirectAttributes.addAttribute("continue", referer);

        return "redirect:http://localhost:8000/login/gsitm";
    }
}
