package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Gato extends Animal implements ComportamientoGato {
    private final static Logger LOGGER = Logger.getLogger("org.example.Gato");

    public Gato(String nombre, String especie , String color, int edad, String sexo) {
        super(nombre, especie, color, edad, sexo);
    }


    public void enterrarUnas(){
        LOGGER.log(Level.INFO,"Te estoy enterrando las uñas");
    }
    public void ronronear(){
        LOGGER.log(Level.INFO,"[SONIDO DE RONRONEO");
    }
    public void subirArbol(){
        LOGGER.log(Level.INFO,"Subiendo arbol");
    }

}
