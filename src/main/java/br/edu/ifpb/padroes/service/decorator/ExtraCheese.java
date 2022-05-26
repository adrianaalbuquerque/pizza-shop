package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheese extends Decorator {
    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName() + " (extra cheese)";
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.10f;
    }
    
}
