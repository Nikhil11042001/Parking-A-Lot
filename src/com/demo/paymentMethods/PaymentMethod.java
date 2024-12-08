package com.demo.paymentMethods;

public interface PaymentMethod {
    public abstract boolean initiatePayment(int amount);
}
