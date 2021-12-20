package com.geekbrains.spring.web.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Order {
private List<Product> productList;
public Order(Long id, String title, Integer price){
    this.productList = new ArrayList<>();
}

}
