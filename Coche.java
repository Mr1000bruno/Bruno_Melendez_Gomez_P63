package Ejercicio6_3;

import javax.swing.*;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private boolean techoSolar;
    private float kilometros;
    private int numPuertas;
    private int numPlazas;

    public Coche() {
        matricula = "";
        marca = "SEAT";
        modelo = "ALTEA";
        color = "BLANCO";
        techoSolar = false;
        kilometros = 0;
        numPuertas = 3;
        numPlazas = 5;
    }

    public Coche(String matricula) {
        this.matricula = matricula;
        marca = "SEAT";
        modelo = "ALTEA";
        color = "BLANCO";
        techoSolar = false;
        kilometros = 0;
        numPuertas = 3;
        numPlazas = 5;
    }

    public Coche(int numPuertas, int numPlazas) {
        matricula = "";
        marca = "SEAT";
        modelo = "ALTEA";
        color = "BLANCO";
        techoSolar = false;
        kilometros = 0;
        setNumPuertas(numPuertas);
        setNumPlazas(numPlazas);
    }

    public Coche(String marca, String modelo, String color) {
        matricula = "";
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        techoSolar = false;
        kilometros = 0;
        numPuertas = 3;
        numPlazas = 5;
    }

    public void avanzar(double kilometros) {
        System.out.println("El coche esta avanzando " + kilometros + " kilometros.");
        this.kilometros += kilometros;
        JOptionPane.showMessageDialog(null , "Ahora en total el coche tiene " + this.kilometros + " kilometros.");


    }

    public void tunear(){
        kilometros = 0;
        if (!techoSolar) {
            techoSolar = true;
            JOptionPane.showMessageDialog(null , "Se ha instalado un techo solar.");
        }
    }


    public void tunear(String color){
        this.color = color;
        kilometros = 0;
        if (!techoSolar) {
            techoSolar = true;
            JOptionPane.showMessageDialog(null , "Se ha instalado un techo solar.");
        }
    }

    public void matricular(String matricula){
        this.matricula = matricula;
        JOptionPane.showMessageDialog(null , "El coche se ha matriculado con la siguiente matricula " + matricula);
    }

    public String getMatricula() {
        return matricula;
    }





    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTechoSolar() {
        return techoSolar;
    }

    public void setTechoSolar(boolean techoSolar) {
        this.techoSolar = techoSolar;
    }

    public float getKilometros() {
        return kilometros;
    }

    public void setKilometros(float kilometros) {
        if (kilometros < 0) {
            System.out.println("El coche no puede tener kilometros negativos.");
        } else {
            this.kilometros = kilometros;
        }
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        if (numPuertas <= 0) {
            JOptionPane.showMessageDialog(null , "El coche no puede tener un numero de puertas negativos.");
        } else {
            this.numPuertas = numPuertas;
        }
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        if (numPlazas <= 0) {
            JOptionPane.showMessageDialog(null , "El coche no puede tener un numero de plazas negativos.");
        } else {
            this.numPlazas = numPlazas;
        }
    }

    @Override
    public String toString() {
        String tieneTechoSolar = techoSolar ? "Tiene techo solar" : "No tiene techo solar";
        return "Matricula: " + matricula + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Color: " + color + "\n" +
                tieneTechoSolar + "\n" +
                "Kilometros: " + kilometros + "\n" +
                "Numero de puertas: " + numPuertas + "\n" +
                "Numero de plazas: " + numPlazas;

    }
}
