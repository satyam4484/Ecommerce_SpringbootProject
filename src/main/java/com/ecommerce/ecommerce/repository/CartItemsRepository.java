package com.ecommerce.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.ecommerce.entity.CartItems;

public interface CartItemsRepository extends JpaRepository<CartItems, Long>{
}
