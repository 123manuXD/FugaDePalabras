/*
 * Archivo: VentanaInicial.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 19/04/2023
 */

 package vistaVentanas;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
import javax.swing.text.html.HTML;

import vistaVentanas.VentanaInicial.ManejadorDeEventos;


public class VentIntrucciones extends JFrame implements ActionListener {
    private Decolib jpImage;
    private JLabel lbltitulo;
    private JLabel lblintrucc;
    private JButton btnvolver;
    private JPanel jpcontend;

    public VentIntrucciones() {
        
        iniciarComponentes();
        getContentPane().setBackground(new Color(252, 197, 192));
        
    }

    private void iniciarComponentes() {
        //Jframe confit
        setTitle("Fuga de palabras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,450);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);

        //configurar objetos
        jpImage = new Decolib("/Imgs/Header.png");
        jpImage.setBounds(0, 280,519,150);
        add(jpImage);

        //Panel incial
        jpcontend = new JPanel();
        jpcontend.setSize(519, 350);
        jpcontend.setBounds(0,0,519,350);
        jpcontend.setLayout(null);
        jpcontend.setBackground(new Color(232, 160, 191));
        add(jpcontend); 

        lbltitulo = new JLabel("INTRUCCIONES FUGA DE PALABRAS");
        lbltitulo.setBounds(30,20,519,20);
        lbltitulo.setForeground(new Color(69, 60, 103));
        lbltitulo.setFont(new Font("arial", Font.ROMAN_BASELINE, 24));

        lblintrucc = new JLabel("<html>Bienvendio, para jugar sigue estos pasos: <p>1.Regresar a la ventana principal.<p>2.Seleccionar categoria.<p>3.Completa la palabra con los botones.<html>");
        //<HTML> Bienvenido, el juego es sencillo, simplemente sigue estos pasos para jugar:<p>1.Regresa a la ventana princial y dale jugar<p>2.Selecciona la Categoria que más que guste.<p>3.Completa las palabras con las vocales en pantalla <HTML>
        lblintrucc.setBounds(20,-25,519,250);
        lblintrucc.setForeground(new Color(69, 60, 103));
        lblintrucc.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));

        btnvolver= new JButton("Volver");
        btnvolver.setBounds(180, 180, 150, 40);

        jpcontend.add(lbltitulo);
        jpcontend.add(lblintrucc);
        jpcontend.add(btnvolver);

        //listeners:
        btnvolver.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == btnvolver){
            dispose();
            VentanaInicial ventana = new VentanaInicial(); 
        }
    }
}
