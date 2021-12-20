package com.geekbrains.spring.web.repositories;

import com.geekbrains.spring.web.entities.Order;
import com.geekbrains.spring.web.entities.Product;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class OrderRepository {
    @Getter
    private Order order;
    public OrderRepository(){
        this.order = new Order();
    }

    public Order add(Product product) {
        order.getProductList().add(product);
        return order;
    }

}
