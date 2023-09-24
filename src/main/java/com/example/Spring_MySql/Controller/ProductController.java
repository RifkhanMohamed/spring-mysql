package com.example.Spring_MySql.Controller;


import com.example.Spring_MySql.Model.Product;
import com.example.Spring_MySql.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/product")
@RequiredArgsConstructor
@Validated
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/get")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @PostMapping(path = "/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @PostMapping(path = "/bulk/upload")
    public List<Product> bulkProductUpload(@RequestBody List<Product> productsList){
        return productService.bulkProductUpload(productsList);
    }

    @PutMapping(path = "/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping(path = "/delete/{productId}")
    public String deleteProduct(@PathVariable Integer productId){
        return productService.deleteProduct(productId);
    }
}
