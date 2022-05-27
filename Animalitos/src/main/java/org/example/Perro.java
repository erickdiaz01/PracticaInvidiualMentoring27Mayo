package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Perro extends Animal implements ComportamientoPerro {
    private final static Logger LOGGER = Logger.getLogger("org.example.Perro");

    public Perro(String nombre, String especie, String color, int edad, String sexo) {
        super(nombre, especie, color, edad, sexo);
    }

    public void ladrar(){
        LOGGER.log(Level.INFO,"GUAU GUAU GUAU");
    }

    public void morder(){
        LOGGER.log(Level.INFO,"Te estoy mordiendo");
    }

    public void jadear(){
        LOGGER.log(Level.INFO,"[SONIDO DE JADEO]");
    }

}

