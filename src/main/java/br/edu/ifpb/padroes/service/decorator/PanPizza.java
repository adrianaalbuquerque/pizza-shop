package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class PanPizza extends Decorator {

    public PanPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return super.getName() + " (pan pizza)";
    }

    @Override
    public Float getPrice() {
        return super.getPrice() * 1.15f;
    }
    
}
