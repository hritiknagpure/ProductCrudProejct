package com.hritik.product.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hritik.product.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    
    Page<Category> findByNameContaining(String name, Pageable pageable);
}
