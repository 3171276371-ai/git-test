package cxt.cn.controller;

//import com.netflix.discovery.DiscoveryClient;
import cxt.cn.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/24 21:34
 */
@RestController
@RequestMapping("getstudent")
public class GetController {
    @Autowired
    private RestTemplate restTemplate;
//    @Autowired
//    private  EurekaDiscoveryClient discoveryClient;
//    @GetMapping("{id}")
//    public Student getStudent(@PathVariable("id")String id){
////        List<ServiceInstance> springCloud_service_provider = discoveryClient.getInstances("SpringCloud_Service_Provider");
////        ServiceInstance serviceInstance = springCloud_service_provider.get(0);
////        return restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/student/"+id,Student.class);
//    }
}
