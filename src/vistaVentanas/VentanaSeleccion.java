
/*
 * Archivo: VentanaSelección.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 14/04/2023
 */

 package vistaVentanas;

 import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.sql.Array;

import javax.swing.*;
import LogicaJuego.LogGame;

 public class VentanaSeleccion extends JFrame implements ActionListener{

    private JLabel lblinfo;
    private JButton btnAnimales;
    private JButton btnFrutas;
    private JButton btnColores;
    private Decolib bt1;
    private Decolib bt2;
    private Decolib bt3;
    private JPanel jpContenido;
    private JPanel jpContA;
    private JPanel jpContB;
    private JPanel jpContC;

    private LogGame lg = new LogGame(); 
    public VentanaSeleccion (){
        iniciarComponentes();
        getContentPane().setBackground((new Color(242, 227, 219)));
        //this.palabraCategoria = palabraCategoria; 

    }

    private void iniciarComponentes() {
        //configuración Del Jframe
        setTitle("Fuga de palabras(Selección)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);

        //configurar de los paneles
        jpContenido = new JPanel();
        jpContenido.setBounds(16,18,900,620);
        jpContenido.setLayout(null);
        jpContenido.setBackground(new Color(65, 100, 74));
        add(jpContenido);

        jpContA = new JPanel();
        jpContA.setSize((int)247.7,(int)338.68);
        jpContA.setBounds((int)39.53, (int)189.06, (int)247.7,(int)338.68);
        jpContA.setLayout(null);
        jpContA.setBackground(new Color(242, 227, 219));

        jpContB = new JPanel();
        jpContB.setSize((int)247.7,(int)338.68);
        jpContB.setBounds((int)332.53, (int)189.06, (int)247.7,(int)338.68);
        jpContB.setLayout(null);
        jpContB.setBackground(new Color(242, 227, 219));

        jpContC = new JPanel();
        jpContC.setSize((int)247.7,(int)338.68);
        jpContC.setBounds((int)626.53, (int)189.06, (int)247.7,(int)338.68);
        jpContC.setLayout(null);
        jpContC.setBackground(new Color(242, 227, 219));
        

        lblinfo = new JLabel("ESCOGE LA TEMATICA", SwingConstants.CENTER);
        lblinfo.setBounds(0, 20, 950, 120);
        lblinfo.setForeground(new Color(242, 227, 219));
        lblinfo.setFont(new Font("arial", Font.ROMAN_BASELINE, 45)); 

        jpContenido.add(lblinfo); 
        jpContenido.add(jpContA);
        jpContenido.add(jpContB);
        jpContenido.add(jpContC);

        btnAnimales = new JButton();
        btnAnimales.setBounds((int)7.16, (int)13.72, (int)227.31, (int)310.53);
        btnAnimales.setBackground(new Color(242, 227, 219));

        btnFrutas = new JButton();
        btnFrutas.setBounds((int)7.16, (int)13.72, (int)227.31, (int)310.53);
        btnFrutas.setBackground(new Color(242, 227, 219));

        btnColores = new JButton();
        btnColores.setBounds((int)7.16, (int)13.72, (int)227.31, (int)310.53);
        btnColores.setBackground(new Color(242, 227, 219));

        jpContA.add(btnAnimales);
        jpContB.add(btnFrutas);
        jpContC.add(btnColores);

        bt1 = new Decolib("/Imgs/PS1.png");
        bt1.setBounds(2, 120,(int)227.31, (int)310.53);
        btnAnimales.add(bt1);

        bt2 = new Decolib("/Imgs/PS2.png");
        bt2.setBounds(2, 2,(int)227.31, (int)310.53);
        btnFrutas.add(bt2);

        bt3 = new Decolib("/Imgs/PS3.png");
        bt3.setBounds(2, 2,(int)227.31, (int)310.53);
        btnColores.add(bt3); 
        

        btnAnimales.addActionListener(this);
        btnFrutas.addActionListener(this);
        btnColores.addActionListener(this);
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == btnAnimales){
            dispose();
            lg.palabraCategoria("animales");
            lg.palabraIndex();
            VentanaJuego ventanaJuego = new VentanaJuego(lg);
        }else if(evento.getSource() == btnColores) {
            dispose();
            lg.palabraCategoria("colores");
            lg.palabraIndex();
            VentanaJuego ventanaJuego = new VentanaJuego(lg);
        }else if(evento.getSource() == btnFrutas){
            dispose();
            lg.palabraCategoria("frutas");
            lg.palabraIndex();
            VentanaJuego ventanaJuego = new VentanaJuego(lg);
        }
    }

   
 }