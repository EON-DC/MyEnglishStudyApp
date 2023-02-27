package com.gwang.myenglishstudyapp.service;

import com.gwang.myenglishstudyapp.domain.Category;
import com.gwang.myenglishstudyapp.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class CategoryDefaultService {


    private final CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        categoryRepository.save(category);
        return category;
    }
}
