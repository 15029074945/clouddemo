package com.jackson.cloud.demo.resource;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jackson on 2017/7/16.
 */

// 使用@FeignClient注解来指定这个接口所要调用的服务名称，
// 接口中定义的各个函数使用Spring MVC的注解就可以来绑定服务提供方的REST接口，
// 比如下面就是绑定eureka-client服务的/dc接口的例子
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
