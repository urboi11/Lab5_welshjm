package com.welshjm.Lab5_welshjm.repositories;

import com.welshjm.Lab5_welshjm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
