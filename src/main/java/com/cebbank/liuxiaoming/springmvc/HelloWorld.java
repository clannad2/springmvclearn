package com.cebbank.liuxiaoming.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    /**
     * 1.使用RequestMapping注解来映射请求的Url
     * 2.通过视图解析器解析为物理视图，对于InternalResourceViewResolver，会做如下解析
     * 通过prefex+returnVal+后缀得到物理视图，然后转发
     * /WEB-INF/views/success.jsp
     * @return
     */
    @RequestMapping("/helloworld")
   public String hello(){
       System.out.println("hello world!");
       return "success";
   }
}
