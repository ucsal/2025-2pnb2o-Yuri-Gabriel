package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
        HashMap<CustomerType, DiscountPolicy> map = new HashMap<CustomerType, DiscountPolicy>();
        map.put(
            CustomerType.PARTNER, new PartnerPolicy()
        );
        map.put(
            CustomerType.PREMIUM, new PremiumPolicy()
        );
        map.put(
            CustomerType.REGULAR, new RegularPolicy()
        );
        var calc = new DiscountCalculator(map);
        assertEquals(88.0, calc.apply(100.0, CustomerType.PARTNER), 0.0001,
            "PARTNER deveria ter 12% de desconto");
    }
}
