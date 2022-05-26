package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class FinishOrder implements Pizza {
    private Pizza pizza;

    public FinishOrder(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }

    @Override
    public Float getPrice() {
        return pizza.getPrice();
    }
    
}
