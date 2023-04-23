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
    //panel baseb
    private JButton btnexit;
    private JPanel jpcontenidogoblal;
    private JLabel lblPalabras;
    private JLabel lblValuePa;
    private JLabel lblIntento;
    private JLabel lblValueInt;
    private JLabel lblfallos;
    private JLabel lblValueFall;
    private JButton btna;
    private JButton btne;
    private JButton btni;
    private JButton btno;
    private JButton btnu;

    //Panel 2
    private JLabel lblPalabraAd;
    private JPanel jpPalabra;

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
        

        ///conofigurar panelPrincipal

        jpcontenidogoblal = new JPanel();
        setLayout(null);
        jpcontenidogoblal.setBounds(28, 10, 876, 598);
        jpcontenidogoblal.setBackground(new Color(65, 100, 74));
        add(jpcontenidogoblal);
        
        lblPalabras = new JLabel(" Numero de Palabras: ");
        lblPalabras.setBounds((int)21.5, (int)61.5 , 163, 35);
        lblPalabras.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));
        lblPalabras.setOpaque(true);
        lblPalabras.setBackground(new Color(222, 222, 222));

        lblValuePa = new JLabel(" 15");
        lblValuePa.setBounds((int)210.5, (int)61.5, 69, 36);
        lblValuePa.setOpaque(true);
        lblValuePa.setBackground(new Color(222, 222, 222));
        
        lblIntento = new JLabel(" Numero de Intentos: ");
        lblIntento.setBounds((int)21.5, (int)113.5, 163, 35);
        lblIntento.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));
        lblIntento.setOpaque(true);
        lblIntento.setBackground(new Color(222, 222, 222));

        lblValueInt = new JLabel(" 14");
        lblValueInt.setBounds((int)210.5, (int)113.5, 69, 36);
        lblValueInt.setOpaque(true);
        lblValueInt.setBackground(new Color(222, 222, 222));

        lblfallos = new JLabel(" Numero de Fallos: ");
        lblfallos.setBounds((int)21.5, (int)169.5, 163, 35);
        lblfallos.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));
        lblfallos.setOpaque(true);
        lblfallos.setBackground(new Color(222, 222, 222));

        lblValueFall = new JLabel(" 12");
        lblValueFall.setBounds((int)210.5, (int)169.5, 69, 36);
        lblValueFall.setOpaque(true);
        lblValueFall.setBackground(new Color(222, 222, 222));

        jpcontenidogoblal.add(lblPalabras);
        jpcontenidogoblal.add(lblValuePa);
        jpcontenidogoblal.add(lblIntento);
        jpcontenidogoblal.add(lblValueInt);
        jpcontenidogoblal.add(lblfallos);
        jpcontenidogoblal.add(lblValueFall);

        //botones
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
        btnexit.setBounds((int)59.5, (int)261.5, 192, 42);
        jpcontenidogoblal.add(btnexit);
        
        jpcontenidogoblal.add(btna);
        jpcontenidogoblal.add(btne);
        jpcontenidogoblal.add(btni);
        jpcontenidogoblal.add(btno);
        jpcontenidogoblal.add(btnu); 

        jpPalabra = new JPanel();
        setLayout(null);
        jpPalabra.setBounds((int)344.5, (int)58.5, 462, 225);
        jpPalabra.setBackground(new Color(242, 227, 219));
        jpcontenidogoblal.add(jpPalabra);
    
        lblPalabraAd = new JLabel("Dinosario");
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

        
    }

    private void igualdad(String vocalUsuario){
        ///
        String vocalAdivinar = "a"; // LogGame.getvocalselect 
        if(vocalAdivinar.equals(vocalUsuario)){
            JOptionPane.showMessageDialog(null, "La vocal coincide cosdsdsd");
            ///while
        }else {
            JOptionPane.showMessageDialog(null, "La vocal no coincide cosdsdsd");
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


}
