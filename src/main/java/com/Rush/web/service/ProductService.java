package com.Rush.web.service;

import com.Rush.web.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",60000),
            new Product(102,"Xiaomi",70000),
            new Product(103,"Samsung",80000)));
    public List<Product> getProducts(){

        return products;
    }
    public Product getProductById(int id){
        return products.stream().filter(p -> p.getProdId() == id)
                .findFirst().get();
        //products.stream().filter(p -> p.getProdId() == id).findFirst().orElse(new Product(100,"No item found",0));
    }
    public void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProd(Product prod){
        int index=0;
        for(int i = 0;i< products.size();i++){
            if(products.get(i).getProdId()==prod.getProdId())
                index=i;
        }products.set(index,prod);
    }
    public void delProd(int id){
        int index=0;
        for(int i = 0;i< products.size();i++){
            if(products.get(i).getProdId()==id)
                index=i;
        }products.remove(index);
    }
}
