
package com.example.demo.repo;

import com.example.demo.Entity.Futsal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface futsalRepository extends JpaRepository<Futsal, Integer> {
}

