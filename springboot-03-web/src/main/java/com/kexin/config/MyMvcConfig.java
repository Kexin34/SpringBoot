package com.kexin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

// 如果，你想diy一些定制化的功能，只要写这个组件，然后将它交给springboot，springboot就会帮我们自动装配！
// 扩展SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    // ViewResolver 实现了视图解析器接口的类，我们就可以把它看做视图解析器

//    @Bean //放到bean中
//    public ViewResolver myViewResolver(){
//        return new MyViewResolver();
//    }
//    //我们写一个静态内部类，视图解析器就需要实现ViewResolver接口
//    private static class MyViewResolver implements ViewResolver {
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }

    // 视图跳转
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // 浏览器发送/test ， 就会跳转到test页面；
        registry.addViewController("/kexin").setViewName("test");
    }
}
