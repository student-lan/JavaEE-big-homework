package controller;

import org.example.Produce;
import org.example.Content;
import org.example.service.ShwProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ShowController {
    @Autowired
    private ShwProService shwProService;

    //查看页
    @RequestMapping(value="/show" ,method = RequestMethod.GET)
    @ResponseBody
    Map<String,Object> showPro(int id){
        Map<String,Object> map = new HashMap<>();
        Produce produce = shwProService.selPro(id);
        if(produce !=null) {
            map.put("code", 200);
            map.put("message",produce);
            map.put("result", true);
        }
        else{
            map.put("code",500);
            map.put("message","未有此商品");
            map.put("result",false);
        }
        return map;
    }
    //展示页
    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    @ResponseBody
    Map<String,Object> showALL(){
        Map<String,Object> map = new HashMap<>();
        List<Content> list = shwProService.showAll();
        if(list!=null){
            map.put("code",200);
            map.put("message",list);
            map.put("result",true);
        }else{
            map.put("code",500);
            map.put("message","无信息");
            map.put("result",false);
        }
        return map;
    }
}
