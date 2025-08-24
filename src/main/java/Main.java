import java.util.HashMap;

import br.com.mariojp.solid.ocp.*;

public class Main {
	public static void main(String[] args) {
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
		DiscountCalculator calc = new DiscountCalculator(map);
		System.out.println("REGULAR 100 -> " + calc.apply(100, CustomerType.REGULAR));
		System.out.println("PREMIUM 100 -> " + calc.apply(100, CustomerType.PREMIUM));
		// PARTNER deveria ter 12%
		System.out.println("PARTNER 100 -> " + calc.apply(100, CustomerType.PARTNER));
	}
}
