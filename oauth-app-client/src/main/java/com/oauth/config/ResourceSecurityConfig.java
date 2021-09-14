package com.oauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Description :
 *
 * @author leejinho
 * @version 1.0
 */
@Configuration
@EnableWebSecurity
public class ResourceSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(WebSecurity web) {
        web
                .ignoring()
                .antMatchers("/css/**", "/js/**", "/images/**")
                .antMatchers("/h2-console/**", "/swagger-ui/**");
    }

    @Override
    protected void configure(HttpSecurity security) throws Exception {
        security
                .csrf().disable()
                .headers().frameOptions().disable()
                .and()

                .authorizeRequests()
                .antMatchers("/main", "/login/gsitm").permitAll()
                .and()

                .formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/authenticate")
                .permitAll()
                .and()

                .httpBasic();
    }
}
