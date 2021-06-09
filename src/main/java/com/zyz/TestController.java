package com.zyz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

/**
 * @author zhengyinzheng
 * @create 2021/6/8 20:45
 */
@Controller
public class TestController {
   

    @RequestMapping("test1")
    public String test1(Model model){
        model.addAttribute("msg","hello thymeleaf");
        model.addAttribute("src","1.jpg");
        List userlist = new ArrayList();
        Map user = new HashMap();
        user.put("name","zyz");
        user.put("age","24");
        user.put("birth",new Date());
        Map user2 = new HashMap();
        user2.put("name","zyz1");
        user2.put("age","25");
        user2.put("birth",new Date());
        Map user3 = new HashMap();
        user3.put("name","zyz3");
        user3.put("age","23");
        user3.put("birth",new Date());
        userlist.add(user);
        userlist.add(user2);
        userlist.add(user3);
        model.addAttribute("userlist",userlist);
        model.addAttribute("user",user);
        model.addAttribute("flag","yes");
        model.addAttribute("admin","admin");
        model.addAttribute("manager","manager");
        model.addAttribute("str","啦啦啦啦啦啦啦啦啦啦啦啦啦");
        return "test1";
    }
    //删除测试方法注释
}
