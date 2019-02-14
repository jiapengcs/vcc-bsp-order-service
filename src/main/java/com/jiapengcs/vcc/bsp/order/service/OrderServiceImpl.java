package com.jiapengcs.vcc.bsp.order.service;

import com.jiapengcs.vcc.bsp.order.bean.Order;
import com.jiapengcs.vcc.bsp.order.dao.OrderDAO;
import com.jiapengcs.vcc.bsp.order.service.remote.User;
import com.jiapengcs.vcc.bsp.order.service.remote.UserServiceRemote;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@Component
public class OrderServiceImpl implements OrderService {

    @Resource
    private UserServiceRemote userServiceRemote;
    @Resource
    private OrderDAO orderDAO;

    @Override
    public List<Order> getOrdersByUserId(Long id) {
        User user = userServiceRemote.getUserById(id);
        System.out.println("User Info: " + user);
        Order order = orderDAO.queryById(id);
        System.out.println("Order Info: " + order);
        return Arrays.asList(order, order, order);
    }
}
