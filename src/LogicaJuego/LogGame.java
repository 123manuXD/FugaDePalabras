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
    private int cantidadAciertos = 0;
    private int cantidadFallos = 0;
    private int cantidadIntentos = 10;
    private int cantidadPalabras = 1;


    //Seleccion de palabra con su vocal remplazada y guardada en una variable
    private String palabrasinvocal;
    private String vocalSelect;


    ///Categorias 
    java.util.List <String> animales = Arrays.asList("leon", "tigre", "jirafa", "elefante", "rinoceronte","hipopotamo", "cocodrilo", "serpiente", "camello", "pingüino", "murcielago", "araña","escarabajo", "mariposa", "abeja", "mosquito", "libelula", "grillo", "cangrejo","gallina", "pato", "cerdo", "vaca", "oveja", "caballo");
    java.util.List <String> frutas = Arrays.asList("manzana", "banana", "naranja", "uva", "pera","sandía", "melón", "durazno", "kiwi", "fresa", "frambuesa", "arándano", "cereza", "piña", "mango","papaya", "guayaba", "maracuyá", "granada", "limón", "mandarina", "toronja", "coco", "pitalla", "cholupa");
    java.util.List <String> colores = Arrays.asList("rojo", "verde", "azul", "amarillo", "naranja","rosa", "violeta", "gris", "blanco", "negro", "marron", "turquesa", "celeste", "beige", "burdeos","plateado", "dorado", "ocre", "esmeralda", "cian", "amaranto", "carmin", "magenta", "oliva", "teja");
    Random rand = new Random();
    private String  palabraCategoria;
    private String categselecionada;

    public LogGame(){
        ///
    }
    

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
        categselecionada = categ;
        System.out.println("Pruebas de categoria" + categselecionada);

    }
    
    private static boolean esVocal(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public void palabraIndex(){
        //Primero obtendremos una vocal que este dentro de la palabra seleccionada (crea conjunto)
        Set<Character> vocalesEnPalabra = new HashSet<>();
        for (char c : palabraCategoria.toCharArray()) {
            if (esVocal(c)) {
                vocalesEnPalabra.add(c);
            }
        }

        //Del conjunto de vocales seleccionamos una
        int index = rand.nextInt(vocalesEnPalabra.size());
        vocalSelect = vocalesEnPalabra.toArray(new Character[0])[index].toString();
        
        palabrasinvocal = palabraCategoria.replace(vocalSelect, "_");
        System.out.println("la vocal seleccionada es "+ vocalSelect);
        System.out.println("La palabra sin vocal es " + palabrasinvocal);   
    }

    public String getCategselecionada() {
        return categselecionada;
    }

    public String getPalabrasinvocal() {
        return palabrasinvocal;
    }
    
    public String getVocalSelect() {
        return vocalSelect;
    }

    public int getCantidadAciertos() {
        return cantidadAciertos;
    }

    public int getCantidadIntentos() {
        return cantidadIntentos;
    }

    public int getCantidadPalabras(){
        return cantidadPalabras;
    }

    public int getCantidadFallos() {
        return cantidadFallos;
    }

    public void cantidadAciertos(){
        cantidadAciertos++;
    }
    public void cantidadIntentos(){
        cantidadIntentos--;
    }
    public void cantidadFallos(){
        cantidadFallos++;
    }

    public void cantidadPalabras(){
        cantidadPalabras++;
    }

    


    
        
}
