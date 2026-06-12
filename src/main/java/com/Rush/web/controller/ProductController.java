package com.Rush.web.controller;

import com.Rush.web.model.Product;
import com.Rush.web.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/Products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @RequestMapping("/Products/{id}")
    public Product getProductById(@PathVariable int id){

        return service.getProductById(id);
    }
    @PostMapping("/addProd")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);

    }
    @PutMapping("/updateProd")
    public void updateProd(@RequestBody Product prod){
        service.updateProd(prod);
    }
}
