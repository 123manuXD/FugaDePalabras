
/*
 * Archivo: VentanaSelección.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 14/04/2023
 */

 package vistaVentanas;

 import java.awt.Color;
 import java.awt.Container;
 import java.awt.Font;
 import java.awt.Graphics;
 import java.awt.Image;
 import java.awt.TextArea;
 import java.awt.TextField;
 import java.awt.Toolkit;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.KeyEvent;
 import java.awt.event.KeyListener;
 import java.security.PrivilegedAction;
 import javax.swing.JButton;
 import javax.swing.JComponent;
 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JOptionPane;
 import javax.swing.JPanel;
 import javax.swing.JTextField;
 import javax.swing.SwingConstants;

 public class VentanaSeleccion extends JFrame{

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

    public VentanaSeleccion (){
        iniciarComponentes();
        getContentPane().setBackground((new Color(65, 100, 74)));
    }

    private void iniciarComponentes() {
        //configuración Del Jframe
        setTitle("Fuga de palabras(JUEGO)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950,700);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);

        //configurar de los paneles
        jpContenido = new JPanel();
        jpContenido.setSize(950,700);
        jpContenido.setBounds(0,0,950,700);
        jpContenido.setLayout(null);
        jpContenido.setBackground(new Color(65, 100, 74));
        add(jpContenido);

        jpContA = new JPanel();
        jpContA.setSize(285,399);
        jpContA.setBounds(19,196,285,399);
        jpContA.setLayout(null);
        jpContA.setBackground(new Color(242, 227, 219));

        jpContB = new JPanel();
        jpContB.setSize(285,399);
        jpContB.setBounds(325,196,285,399);
        jpContB.setLayout(null);
        jpContB.setBackground(new Color(242, 227, 219));

        jpContC = new JPanel();
        jpContC.setSize(285,399);
        jpContC.setBounds(633,196,285,399);
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

        btnAnimales = new JButton("Animales");
        btnAnimales.setBounds(14, 14, 255, 369);
        btnAnimales.setBackground(new Color(242, 227, 219));

        btnFrutas = new JButton("Frutas");
        btnFrutas.setBounds(14, 14, 255, 369);
        btnFrutas.setBackground(new Color(242, 227, 219));

        btnColores = new JButton("Colores");
        btnColores.setBounds(14, 14, 255, 369);
        btnColores.setBackground(new Color(242, 227, 219));

        jpContA.add(btnAnimales);
        jpContB.add(btnFrutas);
        jpContC.add(btnColores);

        bt1 = new Decolib("/Imgs/PS1.png");
        bt1.setBounds(2, 8,260, 350);
        btnAnimales.add(bt1);

        bt2 = new Decolib("/Imgs/PS2.png");
        bt2.setBounds(2, 8,260, 350);
        btnFrutas.add(bt2);

        bt3 = new Decolib("/Imgs/PS3.png");
        bt3.setBounds(2, 8,260, 350);
        btnColores.add(bt3); 
        
        
    }

 }