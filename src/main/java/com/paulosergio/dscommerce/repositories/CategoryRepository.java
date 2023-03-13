package com.paulosergio.dscommerce.repositories;

import com.paulosergio.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
