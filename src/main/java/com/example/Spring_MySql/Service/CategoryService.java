package com.example.Spring_MySql.Service;

import com.example.Spring_MySql.Model.Category;
import com.example.Spring_MySql.Repository.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public List<Category> getAll(){
        return categoryRepo.findAll();
    }

    public Category createCategory(Category category){
        return categoryRepo.save(category);
    }

    public Category updateCategory(Category category) {
        return categoryRepo.save(category);
    }

    public String deleteCategory(Integer categoryID) {
        categoryRepo.deleteById(categoryID);
        return "Deleted Successfully..!";
    }
}
