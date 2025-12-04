package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ecommerce.entity.Address;

// 1. Entity
// 2. primary key datatype

public interface AddressRepository extends JpaRepository<Address,Long> {
}

