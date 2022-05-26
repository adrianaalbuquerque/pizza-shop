package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class DiscountCoupon extends Decorator {
    public DiscountCoupon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 0.25f;
    }
    
}
