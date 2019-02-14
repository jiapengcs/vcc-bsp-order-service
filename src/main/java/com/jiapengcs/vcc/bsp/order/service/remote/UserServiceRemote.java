package com.jiapengcs.vcc.bsp.order.service.remote;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@FeignClient(name = "vcc-bsp-user-service", fallback = UserServiceRemoteHystrix.class)
public interface UserServiceRemote {

    @RequestMapping("/user/query")
    User getUserById(@RequestParam(name = "userId") Long userId);
}
