//package com.oauth.web;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * Description :
// *
// * @author leejinho
// * @version 1.0
// */
//@Slf4j
//@Controller
//public class MainController {
//
//    @GetMapping("/main")
//    public String mainView() {
//        return "main";
//    }
//
//    @GetMapping("/login")
//    public String redirectLoginGsitm(HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes) {
//        String referer = httpServletRequest.getHeader("referer");
//        log.info(referer);
//
//        redirectAttributes.addAttribute("continue", referer);
//
//        return "redirect:http://localhost:8090/login/gsitm";
//    }
//}
