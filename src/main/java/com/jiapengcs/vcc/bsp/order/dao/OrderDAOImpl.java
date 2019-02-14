package com.jiapengcs.vcc.bsp.order.dao;

import com.jiapengcs.vcc.bsp.order.bean.Order;
import org.springframework.stereotype.Component;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@Component
public class OrderDAOImpl implements OrderDAO {

    @Override
    public Order queryById(Long id) {
        return new Order(id, 10086.0);
    }
}
