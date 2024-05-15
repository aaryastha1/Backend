package com.example.demo.service;

//import com.example.demo.entity.Book;
//import com.example.demo.entity.Futsal;
import com.example.demo.pojo.BookPojo;
import com.example.demo.pojo.futsalPojo;

import java.util.List;
import java.util.Optional;

public interface FutsalService {
    List<FutsalService> findAll();

    void saveData(BookPojo futsalPojo);

    void saveData(futsalPojo futsalPojo);

    void deleteById(Integer id);

    Optional<futsalPojo> findById(Integer id);

}
