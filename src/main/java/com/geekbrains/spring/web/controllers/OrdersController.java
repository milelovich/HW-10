package com.geekbrains.spring.web.controllers;

import com.geekbrains.spring.web.converters.OrderConverter;
import com.geekbrains.spring.web.dto.ProductDto;
import com.geekbrains.spring.web.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor

public class OrdersController {

    private final OrderService orderService;
    private final OrderConverter orderConverter;

    @GetMapping
    public ProductDto showOrder(){
        return orderConverter.entityToDto(orderService.getOrder());
    }

    @PutMapping("items/{id}")
    public ProductDto addProduct(@PathVariable long id){
        return orderConverter.entityToDto(orderService.addProduct(id));
    }
}
