package Ejercicio6_3;

import javax.swing.*;

public class Fabrica {
    public static void main(String[] args) {

        Coche[] coches = new Coche[4];

        Coche car1 = new Coche();
        car1.setMatricula("1234-DF");
        car1.setMarca("Seat");
        car1.setModelo("Toledo");
        car1.setColor("Azul");
        car1.setTechoSolar(false);
        car1.setKilometros(200);
        car1.setNumPuertas(3);
        car1.setNumPlazas(5);

        Coche car2 = new Coche("5678-AG");
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.setColor("Rojo");
        car2.setTechoSolar(true);
        car2.setKilometros(300);
        car2.setNumPuertas(3);
        car2.setNumPlazas(2);

        Coche car3 = new Coche(5 , 5);
        car3.setMatricula("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("Gris");
        car3.setTechoSolar(false);
        car3.setKilometros(400);

        Coche car4 = new Coche("VW" , "Caddy" , "Blanco");
        car4.setMatricula("3456-XS");
        car4.setTechoSolar(true);
        car4.setKilometros(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);


        coches[0] = car1;
        coches[1] = car2;
        coches[2] = car3;
        coches[3] = car4;

        JOptionPane.showMessageDialog(null, "BIENVENIDO A LA FABRICA DE COCHES DE BRUNO");

        for (Coche cocheActual : coches) {
            JOptionPane.showMessageDialog(null , caracteristicas(cocheActual));
        }

    }

    public static String caracteristicas(Coche c) {
        String techoSolar = c.isTechoSolar() ? "Tiene techo solar" : "No tiene techo solar";
        return "Matricula " + c.getMatricula() + "\n" +
                "Marca: "+ c.getMarca() + "\n" +
                "Modelo: " + c.getModelo() + "\n" +
                "Color: " + c.getColor() + "\n" +
                techoSolar + "\n" +
                "Kilometros: " + c.getKilometros() + "\n" +
                "Numero de puertas: " + c.getNumPuertas() + "\n" +
                "Numero de plazas: " + c.getNumPlazas() + "\n";

    }
}
