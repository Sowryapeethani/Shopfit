package com.shopfit.services;

import com.shopfit.payload.PaymentDetails;

public interface PaymentService {

    public PaymentDetails CreateOrder(Double amount);

}
