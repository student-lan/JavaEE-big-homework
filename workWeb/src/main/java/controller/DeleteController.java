package controller;

import org.example.Person;
import org.example.service.DelProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DeleteController {

    @Autowired
    private DelProService delProService;

    //删除商品
    @RequestMapping(value = "/api/delete",method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> delete(int id, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        if(person!=null) {
            if(person.getUserType()!=0){
                if (delProService.delPro(id)) {
                    map.put("code", 200);
                    map.put("message", "删除成功");
                    map.put("result", true);
                } else {
                    map.put("code", 500);
                    map.put("message", "删除失败");
                    map.put("result", false);
                }
            }else{
                map.put("code", 500);
                map.put("message", "无权限");
                map.put("result", false);
            }
        }else{
            map.put("code", 500);
            map.put("message", "请先登录");
            map.put("result", false);
        }
        return map;
    }
}
