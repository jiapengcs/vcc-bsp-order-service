package com.jiapengcs.vcc.bsp.order.controller;

import com.jiapengcs.vcc.bsp.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping("/list")
    public Object getOrderList(@RequestParam Long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
