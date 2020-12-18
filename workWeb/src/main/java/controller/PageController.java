package controller;

import org.example.Person;
import org.example.Product;
import org.example.service.SubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class PageController {

    @Autowired
    private SubmitService submitService;

    //登录页
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> loginpage(){
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("message","登录页");
        map.put("result",true);
        return map;
    }

    //发布页
    @RequestMapping(value = "/public",method = RequestMethod.GET)
    @ResponseBody
    Map<String,Object> pubPage(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message","发布页");
        map.put("result", true);
        return map;
    }

    //编辑页
    @RequestMapping(value = "/edit",method = RequestMethod.GET)
    @ResponseBody
    Map<String,Object> editPage( int id, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        if(person.getUserType()!=0){
            Product product = submitService.selProd(id);
            if(product!=null){
                map.put("code", 200);
                map.put("message",product);
                map.put("result", true);
            }else {
                map.put("code",500);
                map.put("message","无商品");
                map.put("result",false);
            }
        }else {
            map.put("code",500);
            map.put("message","无权限");
            map.put("result",false);
        }
        return map;
    }
}
