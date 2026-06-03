package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();

    public Monte() {
        cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (int numero = 1; numero <= 10; numero++) {
                cartas.add(new Carta(numero, naipe));
            }
        }
        embaralhar();

    }

    public void embaralhar(){
        Collections.shuffle(cartas);

    }

    public Carta virar( ){

    }



}
