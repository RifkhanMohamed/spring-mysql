package com.example.Spring_MySql.Controller;

import com.example.Spring_MySql.Model.Category;
import com.example.Spring_MySql.Service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/category")
@RequiredArgsConstructor
@Validated
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/get")
    public List<Category> getAll(){
        return categoryService.getAll();
    }

    @PostMapping("/create")
    public Category create(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @PutMapping(path = "/update")
    public Category updateCategory(@RequestBody Category category){
        return categoryService.updateCategory(category);
    }

    @DeleteMapping(path = "/delete/{categoryId}")
    public String deleteCategory(@PathVariable Integer categoryId){
        return categoryService.deleteCategory(categoryId);
    }
}