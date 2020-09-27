package com.cebbank.liuxiaoming.springmvc;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {
    private static final String SUCCESS="success";

    /**
     * put方法测试
     * @param id
     * @return
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    public String testRestPut(@PathVariable Integer id){
        System.out.println("testRest PUT"+id);
        return "redirect:/springmvc/toFinalPage";
    }


    /**
     * delete方法测试
     * @param id
     * @return
     */
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable Integer id){
        System.out.println("testRest DELETE"+id);
        return "redirect:/springmvc/toFinalPage";
    }

    @RequestMapping("/toFinalPage")
    public String toFinalPage(){
        System.out.println("toFinalPage");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRest(){
        System.out.println("testRest POST");
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable Integer id){
        System.out.println("testRest"+id);
        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable Integer id){
        System.out.println("testPathVariable"+id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testParamsAndHeaders",params = {"username","age!=10"})
    public String testParamsAndHeaders(){
        System.out.println("testParamsAndHeaders");
        return SUCCESS;
    }

    /**
     * 使用method属性来指定请求方式
     * @return
     */
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        System.out.println("testRequestMapping");
        return SUCCESS;
    }
}
