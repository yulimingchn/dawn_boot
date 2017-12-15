package com.dawn.apple.boot.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


/**
 * springboot入门类
 *
 * @author yuliming
 * @create 2017-11-02 16:52
 */
@RestController
@EnableDiscoveryClient
public class HelloController {
    @Autowired
    private DiscoveryClient client;


    @RequestMapping("/hello")
    public String index() throws Exception{
        ServiceInstance instance=client.getLocalServiceInstance();
        //让处理线程等待几秒钟
        int sleepTime=new Random().nextInt(3000);
        System.out.println("sleepTime"+sleepTime);
        Thread.sleep(sleepTime);
        System.out.println("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());

        return "HELLO WORLD";
    }
}
