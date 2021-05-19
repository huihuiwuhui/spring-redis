package com.itcv.demo.aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/index")
    @ResponseBody
    public String index(String param) {
        return "{\"index\":\"server is run\",\"param\":" + param + "}";
    }

}
