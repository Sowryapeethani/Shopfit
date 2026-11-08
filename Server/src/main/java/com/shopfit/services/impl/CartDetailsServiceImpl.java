package com.shopfit.services.impl;

import com.shopfit.payload.CartDetailDto;
import com.shopfit.payload.CartHelp;
import com.shopfit.repositories.CartDetailsRepo;
import com.shopfit.repositories.CartRepo;
import com.shopfit.repositories.UserRepo;
import com.shopfit.services.CartDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartDetailsServiceImpl implements CartDetailsService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CartRepo cartRepo;




    @Override
    public CartDetailDto addProduct(CartHelp cartHelp) {
        int productId=cartHelp.getProductId();
        int quantity= cartHelp.getQuantity();
        String userEmail= cartHelp.getUserEmail();




        //get user





        return null;
    }
}
