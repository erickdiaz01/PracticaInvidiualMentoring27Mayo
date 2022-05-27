package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;

 public abstract class Animal {
    private static final  Logger LOGGER = Logger.getLogger("org.example.Animal");
    String nombre;
    String especie;
    int edad;
    String sexo;
    String color;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Constructor
    Animal(String nombre, String especie, String color, int edad , String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.color=color;
        this.edad= edad;
        this.sexo = sexo;

    }
    public Integer envejecer() {
        return edad++;
    }

     public String getSexo() {
         return sexo;
     }

     public void setSexo(String sexo) {
         this.sexo = sexo;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }

     public String getEspecie() {
         return especie;
     }

     public int getEdad() {
         return edad;
     }

     public void setEdad(int edad) {
         this.edad = edad;
     }

     public void setEspecie(String especie) {
         this.especie = especie;
     }

     public void caminar() {
        LOGGER.log(Level.INFO, "Caminando");
    }
    public void dormir(){
        LOGGER.log(Level.INFO, "ZzzZZzZzZ");
    }


}
