package com.helppoint.product.repository;

import com.helppoint.product.entity.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SizeRepository extends JpaRepository<SizeEntity, Long> {
    
}
