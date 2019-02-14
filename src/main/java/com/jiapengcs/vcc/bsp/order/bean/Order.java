package com.jiapengcs.vcc.bsp.order.bean;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
public class Order {

    private Long id;
    private Double price;

    public Order() {
    }

    public Order(Long id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
