package controller;

import org.example.Person;
import org.example.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class BuyController {

    @Autowired
    private InsOrdService insOrdService;

    //购买商品
    @RequestMapping(value = "/api/buy",method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> buyPro( int contentId,HttpSession session)throws ParseException{
        Map<String,Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        if(session.getAttribute("Person")!=null){
            if(person.getUserType()==0){
                int personId = person.getId();
                if (insOrdService.insertOrderPro(contentId, personId)==null) {
                    map.put("code",500);
                    map.put("message","购买出错");
                    map.put("result",false);
                } else {
                    map.put("code", 200);
                    map.put("message","购买成功");
                    map.put("result", true);
                }
            }else{
                map.put("code",500);
                map.put("message","你是卖家");
                map.put("result",false);
            }
        }else {
            map.put("code",500);
            map.put("message","未登录无法购买");
            map.put("result",false);
        }
        return map;
    }

}
