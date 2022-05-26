package br.edu.ifpb.padroes.service.decorator;

import br.edu.ifpb.padroes.domain.Pizza;

public class Decorator implements Pizza {
    private Pizza wrappee;

    public Decorator(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public String getName() {
        return wrappee.getName();
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice();
    }
    
}
