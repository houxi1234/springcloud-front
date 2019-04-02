package cn.ce.st.controller;

import cn.ce.st.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Descrition TODO
 * @Author houxi
 * @Date 2019/4/2 17:25
 * Version 1.0
 **/
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "getTest")
    public String getTest(){
        return this.testService.getTest();
    }
}
