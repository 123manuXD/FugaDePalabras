/**
 * Archivo: Categorias.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 22/04/2023
 */

/**
 * Objetivo de clase: El objetivo de la clase es tomar la palabra arrojada dentro del array en la ventana
 * seleccion con el fin de guadarla en dos variables, una conocida como palabrasinvocal y vocalselec para 
 * guadarla y compararla, tambien se hace el ciclo.
 * 
 * Tambien se intera crear un contador de eventos, para almacenar los datos de la partida del jugador.
 */


package LogicaJuego;
import vistaVentanas.VentanaSeleccion;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogGame {

    //Puntaje a presentar por ronda final
    private int cantidadPalalbras = 0;
    private int cantidadIntentos = 0;
    private int cantidadFallos = 0;

    //Seleccion de palabra con su vocal remplazada y guardada en una variable
    String palabrasinvocal;
    String vocalSelect;

    ///Categorias 
    java.util.List <String> animales = Arrays.asList("Caballo", "Perro", "Vaca", "Leon", "Gato", "Hormiga", "Marrano", "Serpiente");
    java.util.List <String> frutas = Arrays.asList("Banano","Manzana","Naranja", "Arandano", "Pera", "Cereza", "Guayaba", "Sandia");
    java.util.List <String> colores = Arrays.asList("Azul","Blaco","Rojo", "Amarillo", "Plateado", "Verde","Morado","Violeta");
    Random rand = new Random();
    String  palabraCategoria;
    

    public void palabraCategoria(String categ){
        if(categ.equals("animales")){
            palabraCategoria = animales.get(rand.nextInt(animales.size()));
            System.out.println(palabraCategoria);
        }else if(categ.equals("frutas")){
            palabraCategoria = frutas.get(rand.nextInt(frutas.size()));
            System.out.println(palabraCategoria);
        }else if(categ.equals("colores")){
            palabraCategoria = colores.get(rand.nextInt(colores.size()));
            System.out.println(palabraCategoria);
        }

    }
    
    public void palabraIndex(){
        //Vamos a tomar la palabra que se toma desde VentanaSeleccion, Variable palabraCategoria
        String vocales = "aeiou";
        vocalSelect = String.valueOf(vocales.charAt(rand.nextInt(vocales.length())));
        palabrasinvocal = palabraCategoria.replace(vocalSelect, "_");


    }
        
}
