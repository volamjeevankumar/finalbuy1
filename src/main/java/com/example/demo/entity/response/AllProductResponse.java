package com.example.demo.entity.response;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Getter
@Slf4j
public class AllProductResponse {
    List<ProductResponse> products;

    public void setProducts(List<ProductResponse> products) {
        this.products = products;
    }

}
