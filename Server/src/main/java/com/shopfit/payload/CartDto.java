package com.shopfit.payload;

import com.shopfit.entities.CartDetalis;
import com.shopfit.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int Id;

    private UserDto user;

    private float TotalAmount;

    private List<CartDetailDto> cartDetalis;
}
