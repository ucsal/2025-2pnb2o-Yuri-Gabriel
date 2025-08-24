package br.com.mariojp.solid.ocp;

import java.util.HashMap;

public class DiscountCalculator {
    private HashMap<CustomerType, DiscountPolicy> map;

    public DiscountCalculator(HashMap<CustomerType, DiscountPolicy> map) {
        this.map = map;
    }

    public double apply(double amount, CustomerType type){
        DiscountPolicy discountPolicy = this.map.get(type);

        if(discountPolicy == null) return amount;

        return discountPolicy.apply(amount);
    }
}
