package com.welshjm.Lab5_welshjm.repositories;

import com.welshjm.Lab5_welshjm.entities.Product;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
