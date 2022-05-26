package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
    private List<PizzaHotPizza> cachePizzas = new ArrayList<>();
    private PizzaHotServiceImpl servico = new PizzaHotServiceImpl();

    @Override
    public List<PizzaHotPizza> getPizzas() {
        // TODO - implementar proxy
        if(cachePizzas.isEmpty()) {
            cachePizzas = servico.getPizzas();
        }

        return cachePizzas;
    }
}
