
package com.example.demo.service.impl;


//import com.example.demo.entity.Role;
import com.example.demo.pojo.RolePojo;
import com.example.demo.pojo.RoleProjection;

import java.util.List;

public interface RoleService {

    Integer saveBook(RolePojo rolePojo);

    List<RoleProjection> findAll();
    List<RoleService> findAll2();

    RoleService findById(Integer id);

    void deleteById(Integer id);

}

