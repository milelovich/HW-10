package com.geekbrains.spring.web.services;

import com.geekbrains.spring.web.entities.Order;
import com.geekbrains.spring.web.entities.Product;
import com.geekbrains.spring.web.repositories.OrderRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    private final ProductsService productsService;

    public Order addProduct(Long productId){
        Product product = productsService.findById(productId);
        return orderRepository.add(product);
    }

    public Order getOrder(){
        return orderRepository.getOrder();
    }

}
