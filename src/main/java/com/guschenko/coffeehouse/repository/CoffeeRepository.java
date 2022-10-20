package com.guschenko.coffeehouse.repository;

import com.guschenko.coffeehouse.dto.coffee.Coffee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, String> {}
