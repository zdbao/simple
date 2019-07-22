package com.ls.simple.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebSecurity
public class WebSecurityConfig implements WebMvcConfigurer {

    @Bean
    public UserDetailsService userDetailsService(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(
                User.withDefaultPasswordEncoder().username("user").password("password").roles("USER").build()
        );
        return manager;
    }

    @Bean
    public WebSecurityConfigurerAdapter serucityConfigurerAdapter(){
        WebSecurityConfigurerAdapter adapter = new WebSecurityConfigurerAdapter() {
            @Override
            protected void configure(HttpSecurity http) throws Exception {
                http.authorizeRequests() //该方法有多个子节点，每个匹配器按其声明的顺序进行考虑
                        .antMatchers("/resources/**","/about").permitAll() //如果URL以resources开头，等于about,则任何用户都有访问权限
                        .antMatchers("/list").permitAll()
                        .antMatchers("/admin/**").hasRole("ADMIN") //任何以admin开头的url都将仅限于具有“ROLE_ADMIN”角色的用户。您会注意到，由于我们正在调用该hasRole方法，因此我们不需要指定“ROLE_”前缀
                        .antMatchers("/db/**").access("hasRole('ADMIN') and hasRole('DBA')") //任何以db开头的url都要求用户同时拥有“ROLE_ADMIN”和“ROLE_DBA”。由于我们使用的是hasRole表达式，因此我们不需要指定“ROLE_”前缀。
                        .anyRequest().authenticated()
                        .and()
                    .formLogin()
                        .loginPage("/login") //指定登陆页面
                        .permitAll() //授权所有用户(未经身份验证的用户)访问登陆页面的权限
                        .and()
                    .logout()
                        .logoutUrl("/my/logout") //触发注销url，默认为/logout。如果启用了CSRF保护（默认），则该请求也必须是POST
                        .logoutSuccessUrl("/") //注销后重定向到url,默认是/login?logout
//                        .logoutSuccessHandler(logoutSuccessHandler) //指定一个自定义LogoutSuccessHandler。如果指定了，logoutSuccessUrl()则忽略
                        .invalidateHttpSession(true) //指定HttpSession在注销时是否使其无效。默认情况下这是true
//                        .addLogoutHandler(logoutHandler) //添加一个LogoutHandler。 默认情况下SecurityContextLogoutHandler添加为最后一个LogoutHandler
//                        .deleteCookies(cookieNamesToClear) //允许指定在注销成功时删除的cookie的名称。这是CookieClearingLogoutHandler显式添加的快捷方式
                    ;


            }
        };
        return adapter;
    }
}
