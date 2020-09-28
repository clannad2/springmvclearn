package com.cebbank.liuxiaoming.springmvc;

import com.cebbank.liuxiaoming.springmvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@SessionAttributes(value = {"user"},types = {String.class})
@RequestMapping("/springmvc")
@Controller
public class SpringMvcTest {
    private static final String SUCCESS="success";

    @RequestMapping("/testView")
        public String testView(){
        return "helloView";
    }

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver,");
        return SUCCESS;
    }

    @ModelAttribute
    public void getUser(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map){
        if (id!=null){
            User user = new User(1,"Tom","123456","Tom@guigui.com",13,null);
            System.out.println("从数据库获取对象"+user);
            map.put("abc",user);
        }

    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute(value = "abc") User user){
        System.out.println("testModelAttribute,修改对象"+ user);
        return SUCCESS;
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){
        User user = new User(100,"Tom","123456","Tom@gmail.com",15,null);
        map.put("user",user);
        map.put("school","atguigu");
        return SUCCESS;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        System.out.println(map.getClass().getName());
        map.put("names", Arrays.asList("Tom","Mike","Jerry"));
        return SUCCESS;
    }

    @RequestMapping("/testModeAndView")
    public ModelAndView testModeAndView(){
        String view = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(view);
        modelAndView.addObject("date",new Date());
        return modelAndView;
    }

    @RequestMapping("/testServletAPI")
    public void testServletAPI(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("testServletAPI,"+req+" "+resp);
        //writer.write("你好呀");
        resp.setCharacterEncoding("utf-8");
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        Writer writer = resp.getWriter();
        writer.write("你好呀");
//        return SUCCESS;
    }

    @RequestMapping("/testPojo")
    public String testPojo(User user){
        System.out.println("testPojo,"+user);
        return SUCCESS;
    }

    @RequestMapping("/testCookileValue")
    public String testCookileValue(@CookieValue(value = "JSESSIONID") String sessionId){
        System.out.println("testCookileValue,JSESSIONID="+sessionId);
        return SUCCESS;
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al){
        System.out.println("testRequestHeader,Accept-Language:"+al);
        return SUCCESS;
    }
    /*
    requestParams语法
     */
    @RequestMapping(value = "/testRequestParams ")
    public String testRequestParams(@RequestParam(value = "username") String username,
                                    @RequestParam(value = "age",required = false,defaultValue = "0") int age){
        System.out.println("testRequestParams:username"+username+"age "+age);
        return SUCCESS;
    }



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
