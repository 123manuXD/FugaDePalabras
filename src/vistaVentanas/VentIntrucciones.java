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



public class VentIntrucciones extends JFrame implements ActionListener {
    private Decolib jpImage;
    private JLabel lbltitulo;
    private JLabel lblintrucc;
    private JButton btnvolver;
    private JPanel jpcontend;

    public VentIntrucciones() {
        
        iniciarComponentes();
        getContentPane().setBackground(new Color(242, 227, 219));
        
    }

    private void iniciarComponentes() {
        //Jframe confit
        setTitle("Fuga de palabras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520,450);
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
        jpcontend.setSize(490, 390);
        jpcontend.setBounds((int)7.5,(int)10.5,490,390);
        jpcontend.setLayout(null);
        jpcontend.setBackground(new Color(65, 100, 74));
        add(jpcontend); 

        lbltitulo = new JLabel("INTRUCCIONES FUGA DE PALABRAS");
        lbltitulo.setBounds(30,20,519,20);
        lbltitulo.setForeground(new Color(242, 227, 219));
        lbltitulo.setFont(new Font("arial", Font.ROMAN_BASELINE, 24));

        lblintrucc = new JLabel("<html>Bienvendio, para jugar sigue estos pasos:<p>1.Regresar a la ventana principal.<p>2.Seleccionar categoria.<p>3.Completa la palabra con los botones.<html>");
        lblintrucc.setBounds(30, 70, 519, 100);
        lblintrucc.setForeground(new Color(242, 227, 219));
        lblintrucc.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));

        btnvolver= new JButton("Volver");
        btnvolver.setBounds(180, 190, 150, 40);
        btnvolver.setOpaque(true);
        btnvolver.setBackground(new Color(242, 227, 219));

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
