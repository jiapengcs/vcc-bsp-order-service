package com.jiapengcs.vcc.bsp.order.dao;

import com.jiapengcs.vcc.bsp.order.bean.Order;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
public interface OrderDAO {

    Order queryById(Long id);
}
