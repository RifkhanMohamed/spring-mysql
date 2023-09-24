package com.example.Spring_MySql.Service;

import com.example.Spring_MySql.Model.Product;
import com.example.Spring_MySql.Repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct(){
        return productRepo.findAll();
    }

    public Product createProduct(Product product){
        return productRepo.save(product);
    }

    public List<Product> bulkProductUpload(List<Product> productsList){
        return productRepo.saveAll(productsList);
    }

    public Product updateProduct(Product product) {
        return productRepo.save(product);
    }

    public String deleteProduct(Integer productID) {
        productRepo.deleteById(productID);
        return "Deleted Successfully..!";
    }


}
