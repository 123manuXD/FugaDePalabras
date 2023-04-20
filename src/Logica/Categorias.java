/**
 * Archivo: Categorias.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 19/04/2023
 */

/**
 * Objetivo de clase: El objetivo de esta clase es crear las palabras correspondientes
 * a las 3 categorias que tenemos por seleccion en nuestra ventana, con el fin de que 
 * al pulsar el boton, pueda proyectar diferentes palabras y si es posible imagenes.
 */

package Logica;

public class Categorias {
    //Atributos de clase....
    private String[] categorias = {"Animales","Frutas","Colores"};
    private String[][] palporcateg = new String [categorias.length][];
    private int btncatselc; 
    public Categorias() {
        ///Heee ufff 
        palporcateg[1] = new String []{"Caballo", "Perro", "Vaca"};
        palporcateg[2] = new String []{"Banano"};
        palporcateg[3] = new String []{"Azul"};
    }

    public void setBtncatselc(int btncatselc){
        this.btncatselc = btncatselc;
    }

    public int getBtncatselec(){
        return btncatselc;
    }

    public String[] getCategorias(){
        return categorias;
    }

}
