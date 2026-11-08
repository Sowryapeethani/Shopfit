package com.shopfit.services;

import com.shopfit.entities.Cart;
import com.shopfit.payload.CartDto;
import com.shopfit.payload.CartHelp;
import com.shopfit.payload.UserDto;

public interface CartService {

    //Create
    CartDto CreateCart(CartHelp cartHelp);

    //add Product To Cart
    CartDto addProductToCart(CartHelp cartHelp);

    //Get
    CartDto GetCart(String userEmail);

    //delete product

    void RemoveById(Integer ProductId,String userEmail);

    //delete


}
