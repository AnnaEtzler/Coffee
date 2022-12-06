package com.example.coffee;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface CoffeeRepository extends CrudRepository<Coffee, String> {
    // Coffee - класс который будет через repo сохраняться в таблице базы данных
    // String - тип ключа этого класса
    @Query("SELECT name FROM Coffee WHERE name LIKE %name%")
    List<Coffee> getCoffeeByName(@PathVariable String name);
}
