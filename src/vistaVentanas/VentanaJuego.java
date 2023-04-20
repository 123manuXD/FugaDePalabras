/*
 * Archivo: VentanaJuego.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 14/04/2023
 */

 package vistaVentanas;

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

public class VentanaJuego extends JFrame{
    //panel baseb
    private JButton btnexit;
    private JPanel jpexit;

    ///Panel 1
    private JLabel lblPalabras;
    private JLabel lblValuePa;
    private JLabel lblIntento;
    private JLabel lblValueInt;
    private JLabel lblfallos;
    private JLabel lblValueFall;
    private JPanel jpContenido1;

    //Panel 2
    private JLabel lblPalabraAd;
    private JPanel jpPalbra;
    private JPanel jpimagend;

    //panel 3
    private JButton btna;
    private JButton btne;
    private JButton btni;
    private JButton btno;
    private JButton btnu;
    private JPanel jpvocal;

    public VentanaJuego(){
        iniciarComponentes();
        getContentPane().setBackground((new Color(242, 227, 219)));
    
    }

    private void iniciarComponentes() {
        //Configuración Jframe
        setTitle("Fuga de palabras(JUEGO)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);

        ///conofigurar panel b 
        
        jpexit = new JPanel();
        jpexit.setSize(109, 44);
        jpexit.setBounds(827, 5, 95, 37);
        jpexit.setBackground(new Color(232, 106, 51));
        add(jpexit);
        btnexit = new JButton("Terminar");
        btnexit.setBackground(new Color(232, 106, 51)); 
        
        jpexit.add(btnexit); 

        //Configurar panel 1
        jpContenido1 = new JPanel();
        jpContenido1.setSize(827, 60);
        jpContenido1.setBounds(59, 59, 827, 60);
        jpContenido1.setBackground(new Color(232, 106, 51));
        add(jpContenido1);

        lblPalabras = new JLabel(" Numero de Palabras: ");
        lblPalabras.setSize(163, 35);
        lblPalabras.setBounds((int)16.5, (int)13.5 , 164, 35);
        lblPalabras.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblPalabras.setOpaque(true);
        lblPalabras.setBackground(new Color(222, 222, 222));

        lblValuePa = new JLabel(" 15");
        lblValuePa.setSize(69, 36);
        lblValuePa.setBounds((int)189.5, (int)13.5, 69, 36);
        lblValuePa.setOpaque(true);
        lblValuePa.setBackground(new Color(222, 222, 222));
        
        lblIntento = new JLabel(" Numero de Intentos: ");
        lblIntento.setSize(163, 35);
        lblIntento.setBounds((int)295.5, (int)13.5, 163, 35);
        lblIntento.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblIntento.setOpaque(true);
        lblIntento.setBackground(new Color(222, 222, 222));

        lblValueInt = new JLabel(" 14");
        lblValueInt.setSize(69, 36);
        lblValueInt.setBounds((int)465.5, (int)13.5, 69, 36);
        lblValueInt.setOpaque(true);
        lblValueInt.setBackground(new Color(222, 222, 222));

        lblfallos = new JLabel(" Numero de Fallos: ");
        lblfallos.setSize(163, 35);
        lblfallos.setBounds((int)565.5, (int)13.5, 163, 35);
        lblfallos.setFont(new Font("arial", Font.ROMAN_BASELINE, 15));
        lblfallos.setOpaque(true);
        lblfallos.setBackground(new Color(222, 222, 222));

        lblValueFall = new JLabel(" 12");
        lblValueFall.setSize(69, 36);
        lblValueFall.setBounds((int)740.5, (int)13.5, 69, 36);
        lblValueFall.setOpaque(true);
        lblValueFall.setBackground(new Color(222, 222, 222));

        jpContenido1.add(lblPalabras);
        jpContenido1.add(lblValuePa);
        jpContenido1.add(lblIntento);
        jpContenido1.add(lblValueInt);
        jpContenido1.add(lblfallos);
        jpContenido1.add(lblValueFall);

        //configurar panel 2
        jpPalbra = new JPanel();
        jpPalbra.setSize(827, 296);
        jpPalbra.setBounds((int)58.5, (int)176.5, 827, 296);
        jpPalbra.setBackground(new Color(65, 100, 74));
        add(jpPalbra);

        jpimagend = new JPanel();
        jpimagend.setSize(326, 268);
        jpimagend.setBounds((int)16.5, (int)13.5, 326, 268);
        jpimagend.setBackground(new Color(222, 222, 222));
        jpPalbra.add(jpimagend);

        lblPalabraAd = new JLabel("Prueb_");
        lblPalabraAd.setSize(392, 178);
        lblPalabraAd.setBounds((int)376.5, (int)59.5, 392, 178);
        lblPalabraAd.setFont(new Font("arial", Font.ROMAN_BASELINE, 80));
        lblPalabraAd.setOpaque(true);
        lblPalabraAd.setBackground(new Color(222, 222, 222));

        jpPalbra.add(lblPalabraAd);

        //Configurar Panel 3
        jpvocal = new JPanel();
        jpvocal.setSize(886, 122);
        jpvocal.setBounds((int)26.5, (int)516.5 , 886, 152);
        jpvocal.setBackground(new Color(65, 100, 74));
        add(jpvocal);

        btna = new JButton("a");
        btna.setSize(120, 120);
        btna.setBounds((int)32.5 , (int)14.5, 120, 120);
        btna.setFont(new Font("arial", Font.ROMAN_BASELINE, 25));
        btna.setOpaque(true);
        btna.setBackground(new Color(222, 222, 222));
       
        btne = new JButton("e");
        btne.setSize(120, 120);
        btne.setBounds((int)209.5 , (int)14.5, 120, 120);
        btne.setFont(new Font("arial", Font.ROMAN_BASELINE, 25));
        btne.setOpaque(true);
        btne.setBackground(new Color(222, 222, 222));

        btni = new JButton("i");
        btni.setSize(120, 120);
        btni.setBounds((int)389.5 , (int)14.5, 120, 120);
        btni.setFont(new Font("arial", Font.ROMAN_BASELINE, 25));
        btni.setOpaque(true);
        btni.setBackground(new Color(222, 222, 222));

        btno = new JButton("o");
        btno.setSize(120, 120);
        btna.setBounds((int)563.5 , (int)14.5, 120, 120);
        btno.setFont(new Font("arial", Font.ROMAN_BASELINE, 25));
        btno.setOpaque(true);
        btno.setBackground(new Color(222, 222, 222));

        btnu = new JButton("u");
        btnu.setSize(120, 120);
        btna.setBounds((int)741.5 , (int)14.5, 120, 120);
        btnu.setFont(new Font("arial", Font.ROMAN_BASELINE, 25));
        btnu.setOpaque(true);
        btnu.setBackground(new Color(222, 222, 222));
        
        jpvocal.add(btna);
        jpvocal.add(btne);
        jpvocal.add(btni);
        jpvocal.add(btno);
        jpvocal.add(btnu);

    }
}
