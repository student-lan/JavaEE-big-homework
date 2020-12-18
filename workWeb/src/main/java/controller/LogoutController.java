package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LogoutController {
    //退出
    @RequestMapping(value = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> logout(HttpSession session){
        Map<String,Object> map = new HashMap<>();
        if (session.getAttribute("Person")==null) {
            map.put("code", 500);
            map.put("result", false);
        }else {
            session.removeAttribute("Person");
            map.put("code", 200);
            map.put("result", true);
        }
        return map;
    }

}
