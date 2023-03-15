package com.company.crudbasic.repository;

import com.company.crudbasic.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
