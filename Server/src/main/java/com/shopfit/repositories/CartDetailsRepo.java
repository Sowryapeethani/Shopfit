package com.shopfit.repositories;

import com.shopfit.entities.Cart;
import com.shopfit.entities.CartDetalis;
import com.shopfit.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartDetailsRepo extends JpaRepository<CartDetalis,Integer> {
    public void deleteByProductsAndCart(Product product, Cart cart);
    public CartDetalis findByProductsAndCart(Product product, Cart cart);
}
