package controller;

import org.example.Person;
import org.example.Product;
import org.example.service.SubmitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SubmitController {
    @Autowired
    private SubmitService submitService;



    //添加商品
    @RequestMapping(value = "/publicSubmit",method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> insertPro( String title, String abstracts, String text , String icon , int price, HttpSession session){
        Map<String, Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        if(person.getUserType()!=0){
            Product product = submitService.submit(title,abstracts,text,icon,price);
            if(product!=null){
                map.put("code", 200);
                map.put("message",product);
                map.put("result", true);
            }else {
                map.put("code",500);
                map.put("message","添加失败");
                map.put("result",false);
            }

        }else {
            map.put("code",500);
            map.put("message","无权限");
            map.put("result",false);
        }
        return map;
    }



    //编辑商品
    @RequestMapping(value = "/editSubmit",method = RequestMethod.POST)
    @ResponseBody
    Map<String,Object> editPro(@RequestBody Product product, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        Person person = (Person) session.getAttribute("Person");
        System.out.println(person);
        if(person.getUserType()!=0){
            Product product1 = submitService.updEdit(product);
            if(product1!=null){
                map.put("code", 200);
                map.put("message",product1);
                map.put("result", true);
            }else {
                map.put("code",500);
                map.put("message","修改失败");
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
