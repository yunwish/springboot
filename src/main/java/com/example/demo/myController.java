package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/my")
public class myController {

    @RequestMapping(value = "/ss")
    @ResponseBody
    public String x(){


        String xa = "1212222";
        String xa1 = "1212222";
        String xa2 = "1212222";
        String xa3 = "1212222";


        return "x";
    }
	@RequestMapping(value = "/sss")
    @ResponseBody
    public String xw(){

        return "xxxxxx";
    }
	@RequestMapping(value = "/aa")
    @ResponseBody
    public String xwq(){

        return "aaaa";
    }
	@RequestMapping(value = "/wq")
    @ResponseBody
    public String xssq(){

        String a= "xasxa+";
        return "ssss";
    }
	@RequestMapping(value = "/nihao")
    @ResponseBody
    public String nihao(){




        return "nihao";
    }
}
