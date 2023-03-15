package com.company.crudbasic.repository;

import com.company.crudbasic.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
