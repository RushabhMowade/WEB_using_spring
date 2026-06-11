package com.Rush.web.service;

import com.Rush.web.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = Arrays.asList(
            new Product(101,"Iphone",60000),
            new Product(102,"Xiaomi",70000),
            new Product(103,"Samsung",80000));
    public List<Product> getProducts(){

        return products;
    }
}
