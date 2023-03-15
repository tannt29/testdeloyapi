package com.company.crudbasic.service;

import com.company.crudbasic.repository.CategoryRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ICategory{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public com.company.crudbasic.model.Category add(Category category) {
        if(category!=null) {

        }
        return null;
    }
}
