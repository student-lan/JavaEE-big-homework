package controller;

import org.example.Person;
import org.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
//@RequestMapping("/html")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/html/index")
    public String login(){
        return "/html/login";
    }

    //登录
    @RequestMapping(value = "/api/login", method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> loginsubmit(HttpSession session,String userName, String password){
        Map<String,Object> map = new HashMap<>();
            Person person = personService.findByName(userName,password);
            if(person!=null){
            map.put("code",200);
            map.put("result",true);
            session.setAttribute("Person",person);
        }
        else{
           map.put("code",500);
           map.put("result",false);
        }
        return map;
    }




}
