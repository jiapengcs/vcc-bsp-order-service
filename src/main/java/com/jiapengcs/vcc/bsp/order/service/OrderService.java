package com.jiapengcs.vcc.bsp.order.service;

import com.jiapengcs.vcc.bsp.order.bean.Order;

import java.util.List;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
public interface OrderService {

    List<Order> getOrdersByUserId(Long id);
}
