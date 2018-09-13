package com.example.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Reference(version = "1.0.0")
    private HelloService demoService;

    @Test
    public void testConsume() {
        String sayHello = demoService.sayHello("MRB");
        System.out.println(sayHello);
    }
}
