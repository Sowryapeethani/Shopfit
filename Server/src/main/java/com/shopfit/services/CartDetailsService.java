package com.shopfit.services;

import com.shopfit.payload.CartDetailDto;
import com.shopfit.payload.CartHelp;
import org.springframework.stereotype.Service;

@Service
public interface CartDetailsService {

    //add product
    public CartDetailDto addProduct(CartHelp cartHelp);
}
