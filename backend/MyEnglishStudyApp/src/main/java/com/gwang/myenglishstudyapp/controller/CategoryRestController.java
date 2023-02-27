package com.gwang.myenglishstudyapp.controller;

import com.gwang.myenglishstudyapp.domain.Category;
import com.gwang.myenglishstudyapp.repository.CategoryRepository;
import com.gwang.myenglishstudyapp.service.CategoryDefaultService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Transactional
public class CategoryRestController {

    //    private final CategoryDefaultService categoryService;
    private final CategoryRepository categoryRepository;
    @GetMapping("/category")
    public List<Category> findAll() {
        return categoryRepository.findAll();

    }

    @GetMapping("/category/new")
    public Category newOne() {
        return new Category();
    }

    @PostMapping("/category")
    public Category save(@RequestBody Category category) {
        System.out.println(category);

        categoryRepository.save(category);
        return category;
    }
}
