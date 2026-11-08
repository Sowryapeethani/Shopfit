package com.shopfit.services;

import com.shopfit.payload.SingIn;
import com.shopfit.payload.UserDto;

public interface UserService {


    UserDto CreateUser(UserDto userDto);

    SingIn SingIn(SingIn singIn);
}
