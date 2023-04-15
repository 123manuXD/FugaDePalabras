/*
 * Archivo: VentanaInicial.java
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



public class VentanaInicial  extends JFrame{
    
    private Decolib jpImage;
    private JLabel lblBienvenida;
    private JLabel lblNombreP;
    private JTextField txtNombre;
    private JButton btninciar;
    private JPanel jpcontenedor;

    public VentanaInicial(){
        iniciarComponentes();
        getContentPane().setBackground(new Color(252, 197, 192));
         
    }
    
    private void iniciarComponentes(){
        //Configuración del Jframe
        setTitle("Fuga de palabras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(519,450);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
         
        // configuración de los objetos 

        jpImage = new Decolib("/Imgs/Header.png");
        jpImage.setBounds(0, 280,519,150);
        add(jpImage);

        jpcontenedor = new JPanel();
        jpcontenedor.setSize(519, 350);
        jpcontenedor.setBounds(0,0,519,350);
        jpcontenedor.setLayout(null);
        jpcontenedor.setBackground(new Color(232, 160, 191));
        add(jpcontenedor); 

        lblBienvenida = new JLabel("BIENVENIDO A FUGA DE PALABRAS");
        lblBienvenida.setBounds(20,20,519,45);
        lblBienvenida.setForeground(new Color(69, 60, 103));
        lblBienvenida.setFont(new Font("arial", Font.ROMAN_BASELINE, 26));
        
        lblNombreP = new JLabel("Nombre: ",SwingConstants.CENTER);
        lblNombreP.setBounds(20, 100, 100,30);
        lblNombreP.setForeground(new Color(69, 60, 103));
        lblNombreP.setFont(new Font("arial", Font.ROMAN_BASELINE, 22));
        
        btninciar = new JButton("Ingresar");
        btninciar.setBounds(180, 180, 150, 40);

        jpcontenedor.add(lblBienvenida);
        jpcontenedor.add(lblNombreP);
        jpcontenedor.add(btninciar);

        txtNombre = new JTextField("");
        txtNombre.setBounds(130, 100, 350, 40);
        txtNombre.setForeground(Color.GRAY);
        txtNombre.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));
        
        jpcontenedor.add(txtNombre);
        
        
    }
}
