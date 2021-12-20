package com.geekbrains.spring.web.converters;

import com.geekbrains.spring.web.dto.ProductDto;
import com.geekbrains.spring.web.entities.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public Order dtoToEntity(ProductDto productDto) {
        return new Order(productDto.getId(), productDto.getTitle(), productDto.getPrice());
    }

    public ProductDto entityToDto(Order product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getPrice());
    }


}
