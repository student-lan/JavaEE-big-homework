package controller;

import org.example.Account;
import org.example.Person;
import org.example.service.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AccController {
    @Autowired
    private AccService accService;

    //账务页
    @RequestMapping(value = "/account",method = RequestMethod.GET)
    @ResponseBody
    Map<String,Object> selACC(HttpSession session){
        Map<String,Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        int personId = person.getId();
        List<Account> list = accService.selAcc(personId);
        if(list!=null){
            map.put("code",200);
            map.put("message",list);
            map.put("result",true);
        }else {
            map.put("code",500);
            map.put("message","无订单");
            map.put("result",false);
        }
        return map;
    }
}
