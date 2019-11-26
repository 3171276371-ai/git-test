package cxt.cn.client;

import cxt.cn.pojo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:陈啸掭
 * @Description:
 * @CreateTime: 2019/11/26 21:18
 */
@FeignClient("SpringCloudServiceProvider")
public interface FeginClientDemo {
    @GetMapping("student/{id}")
    public Student findById(@PathVariable("id")String id) throws InterruptedException;
}
