package cxt.cn.controller;

//import com.netflix.discovery.DiscoveryClient;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import cxt.cn.client.FeginClientDemo;
import cxt.cn.pojo.Student;
import javafx.beans.DefaultProperty;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/24 21:34
 */
@RestController
@RequestMapping("getstudent")
//@DefaultProperties(defaultFallback = "fallback1")
public class GetController {
//    @Autowired
//    private RestTemplate restTemplate;
//    @GetMapping
//    @HystrixCommand
    @Autowired
    private FeginClientDemo client;
    @GetMapping
    public String getStudent(@RequestParam("id")String id) throws InterruptedException {
//        return restTemplate.getForObject("http://SpringCloudServiceProvider/student/"+id,Student.class).toString();
        return client.findById(id).toString();
    }
//    public String fallback(String id){
//        return "服务区正忙";
//    }
//    public String fallback1(){
//        return "服务区正忙";
//    }
}
