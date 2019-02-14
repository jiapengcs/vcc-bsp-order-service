package com.jiapengcs.vcc.bsp.order.service.remote;

import org.springframework.stereotype.Component;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@Component
public class UserServiceRemoteHystrix implements UserServiceRemote {

    @Override
    public User getUserById(Long userId) {
        System.out.println("call User RPC failed!");
        return null;
    }
}
