/*
 * Archivo: VentanaJuego.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 14/04/2023
 */

 package vistaVentanas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import LogicaJuego.LogGame;

public class VentanaJuego extends JFrame implements ActionListener{
    
    //panel principal
    private JPanel jpcontenidogoblal;
    //estadisticas y botones
    private JLabel lblPalabras;
    private JLabel lblValuePa;
    private JLabel lblIntento;
    private JLabel lblValueInt;
    private JLabel lblfallos;
    private JLabel lblValueFall;
    private JButton btnnuevapalabra;
    private JButton btnexit;
    //Botones vocales
    private JButton btna;
    private JButton btne;
    private JButton btni;
    private JButton btno;
    private JButton btnu;
    
    //Para traer letra al sistema
    private JLabel lblPalabraAd;
    private JPanel jpPalabra;

    //Decoracion de imagenes
    private Decolib im1;
    private Decolib im2;
    private Decolib im3;
    private Decolib im4;
    private Decolib im5;

    private int cantidadPalabras = 1;

    public VentanaJuego(){
        iniciarComponentes();
        getContentPane().setBackground((new Color(242, 227, 219)));
    }

    private void iniciarComponentes() {
        //Configuración Jframe
        setTitle("Fuga de palabras(JUEGO)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,660);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
        

        ///configurar panelPrincipal

        jpcontenidogoblal = new JPanel();
        jpcontenidogoblal.setLayout(null);
        jpcontenidogoblal.setBounds(28, 10, 876, 598);
        jpcontenidogoblal.setBackground(new Color(65, 100, 74));
        add(jpcontenidogoblal);
        
        //configurar panelDatosPartida

        lblPalabras = new JLabel(" Numero de Palabras: ");
        lblPalabras.setBounds((int)21.5, (int)181.5 , 163, 35);
        lblPalabras.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblPalabras.setOpaque(true);
        lblPalabras.setBackground(new Color(242, 227, 219));

        lblValuePa = new JLabel(" 15", SwingConstants.CENTER);
        lblValuePa.setBounds((int)210.5, (int)181.5, 69, 36);
        lblValuePa.setOpaque(true);
        lblValuePa.setBackground(new Color(242, 227, 219));
        
        lblIntento = new JLabel(" Numero de Intentos: ");
        lblIntento.setBounds((int)21.5, (int)233.5, 163, 35);
        lblIntento.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblIntento.setOpaque(true);
        lblIntento.setBackground(new Color(242, 227, 219));

        lblValueInt = new JLabel(/*LogGame.getCantidadIntentos()*/"12",SwingConstants.CENTER);
        lblValueInt.setBounds((int)210.5, (int)233.5, 69, 36);
        lblValueInt.setOpaque(true);
        lblValueInt.setBackground(new Color(242, 227, 219));

        lblfallos = new JLabel(" Numero de Fallos: ");
        lblfallos.setBounds((int)21.5, (int)290.5, 163, 35);
        lblfallos.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblfallos.setOpaque(true);
        lblfallos.setBackground(new Color(242, 227, 219));

        lblValueFall = new JLabel(/*LogGame.getCantidadFallos()*/"12", SwingConstants.CENTER);
        lblValueFall.setBounds((int)210.5, (int)290.5, 69, 36);
        lblValueFall.setOpaque(true);
        lblValueFall.setBackground(new Color(242, 227, 219));

        jpcontenidogoblal.add(lblPalabras);
        jpcontenidogoblal.add(lblValuePa);
        jpcontenidogoblal.add(lblIntento);
        jpcontenidogoblal.add(lblValueInt);
        jpcontenidogoblal.add(lblfallos);
        jpcontenidogoblal.add(lblValueFall);

        //Panel para los botones 
        btna = new JButton("a");
        btna.setSize(120, 120);
        btna.setBounds((int)344.5 , (int)317.5, 120, 120);
        btna.setFont(new Font("arial", Font.ROMAN_BASELINE, 50));
        btna.setOpaque(true);
        btna.setBackground(new Color(242, 227, 219));
       
        btne = new JButton("e");
        btne.setSize(120, 120);
        btne.setBounds((int)516.5 , (int)317.5, 120, 120);
        btne.setFont(new Font("arial", Font.ROMAN_BASELINE, 50));
        btne.setOpaque(true);
        btne.setBackground(new Color(242, 227, 219));

        btni = new JButton("i");
        btni.setSize(120, 120);
        btni.setBounds((int)687.5 , (int)317.5, 120, 120);
        btni.setFont(new Font("arial", Font.ROMAN_BASELINE, 50));
        btni.setOpaque(true);
        btni.setBackground(new Color(242, 227, 219));

        btno = new JButton("o");
        btno.setSize(120, 120);
        btno.setBounds((int)425.5 , (int)454.5, 120, 120);
        btno.setFont(new Font("arial", Font.ROMAN_BASELINE, 50));
        btno.setOpaque(true);
        btno.setBackground(new Color(242, 227, 219));

        btnu = new JButton("u");
        btnu.setSize(120, 120);
        btnu.setBounds((int)595.5 , (int)454.5, 120, 120);
        btnu.setFont(new Font("arial", Font.ROMAN_BASELINE, 50));
        btnu.setOpaque(true);
        btnu.setBackground(new Color(242, 227, 219));

        btnexit = new JButton("Terminar Juego");
        btnexit.setBounds((int)59.5, (int)441.5, 192, 42);
        btnexit.setOpaque(true);
        btnexit.setBackground(new Color(242, 227, 219));
        jpcontenidogoblal.add(btnexit);
       

        btnnuevapalabra = new JButton("Nueva palaabra");
        btnnuevapalabra.setBounds((int)59.5, (int)381.5, 192, 42);
        btnnuevapalabra.setOpaque(true);
        btnnuevapalabra.setBackground(new Color(242, 227, 219));
        jpcontenidogoblal.add(btnnuevapalabra);
        
        jpcontenidogoblal.add(btna);
        jpcontenidogoblal.add(btne);
        jpcontenidogoblal.add(btni);
        jpcontenidogoblal.add(btno);
        jpcontenidogoblal.add(btnu); 

        //configuracion para imagenes
        im1 = new Decolib("/Imgs/Im1.png");
        im1.setBounds(727, 195, 109, 104);
        jpcontenidogoblal.add(im1);
        im2 = new Decolib("/Imgs/Im2.png");
        im2.setBounds( 464, 17, 241, 58);
        jpcontenidogoblal.add(im2);
        im3 = new Decolib("/Imgs/Im3.png");
        im3.setBounds(222, 119, 59, 60);
        jpcontenidogoblal.add(im3);
        im4 = new Decolib("/Imgs/Im4.png");
        im4.setBounds(325, 215, 90, 88 );
        jpcontenidogoblal.add(im4);
        im5 = new Decolib("/Imgs/Im5.png");
        im5.setBounds(40, 502, 230, 81);
        jpcontenidogoblal.add(im5);

        //Panel para adivinar palabra
        jpPalabra = new JPanel();
        jpPalabra.setLayout(null);
        jpPalabra.setBounds((int)344.5, (int)58.5, 462, 225);
        jpPalabra.setBackground(new Color(242, 227, 219));
        jpcontenidogoblal.add(jpPalabra);
    
        lblPalabraAd = new JLabel(/*LogGame.getPalabrasinvocal()*/);
        lblPalabraAd.setSize(392, 178);
        lblPalabraAd.setBounds((int)34.5, (int)22.5, 392, 178);
        lblPalabraAd.setFont(new Font("arial", Font.ROMAN_BASELINE, 80));
        lblPalabraAd.setOpaque(true);
        lblPalabraAd.setBackground(new Color(222, 222, 222));
        setLayout(null);
        jpPalabra.add(lblPalabraAd);


        btna.addActionListener(this);
        btne.addActionListener(this);
        btni.addActionListener(this);
        btno.addActionListener(this);
        btnu.addActionListener(this);
        btnexit.addActionListener(this);
        btnnuevapalabra.addActionListener(this);

        
    }

    private void igualdad(String vocalUsuario){
        ///
        String vocalAdivinar = "a"; // LogGame.getvocalselect 
        if(vocalAdivinar.equals(vocalUsuario)){
            JOptionPane.showMessageDialog(null, "La vocal coincide, Felicidades");
            ///while
        }else {
            JOptionPane.showMessageDialog(null, "La vocal no coincide, Intente de nuevo");
        }
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == btna) {
          igualdad("a");
        }else if (evento.getSource() == btne) {
            igualdad("e");
        }else if (evento.getSource() == btni) {
            igualdad("i");
        }else if (evento.getSource() == btno) {
            igualdad("o");
        }else if (evento.getSource() == btnu) {
            igualdad("u");
        }
    
    }
    public void terminarJuego(ActionEvent finish){
        ////
    }


}
