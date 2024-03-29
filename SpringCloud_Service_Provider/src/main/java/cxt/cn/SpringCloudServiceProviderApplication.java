package cxt.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cxt.cn.dao")
@EnableDiscoveryClient
public class SpringCloudServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceProviderApplication.class, args);
    }

}
