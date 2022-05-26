package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class StuffedCrust extends Decorator {

    public StuffedCrust(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName() + " (stuffed crust)";
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.20f;
    }
    
}
