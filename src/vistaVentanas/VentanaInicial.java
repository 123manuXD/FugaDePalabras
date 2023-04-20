/*
 * Archivo: VentanaInicial.java
 * Autor: Manuel Felipe Cardoso Forero
 * Fecha de creación: 14/04/2023
 */

package vistaVentanas;
import Logica.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class VentanaInicial  extends JFrame implements ActionListener {
    
    private Decolib jpImage;
    private JLabel lblBienvenida;
    private JLabel lblNombreP;
    private JTextField txtNombre;
    private JButton btninciar;
    private JButton btninstruciones;
    private JPanel jpcontenedor;

    public VentanaInicial(){
        iniciarComponentes();
        getContentPane().setBackground(new Color(242, 227, 219));
         
    }
    
    private void iniciarComponentes(){
        //Configuración del Jframe
        setTitle("Fuga de palabras");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520,450);
        setLocationRelativeTo(null);
        setVisible(true); 
        setResizable(false);
        setLayout(null);
         
        // configuración de los objetos 

        jpImage = new Decolib("/Imgs/Header.png");
        jpImage.setBounds(0, 280,519,150);
        add(jpImage);

        jpcontenedor = new JPanel();
        jpcontenedor.setSize(490, 390);
        jpcontenedor.setBounds((int)7.5,(int)10.5,490,390);
        jpcontenedor.setLayout(null);
        jpcontenedor.setBackground(new Color(65, 100, 74));
        add(jpcontenedor); 

        lblBienvenida = new JLabel("BIENVENIDO A FUGA DE PALABRAS");
        lblBienvenida.setBounds(20,20,519,45);
        lblBienvenida.setForeground(new Color(242, 227, 219));
        lblBienvenida.setFont(new Font("arial", Font.ROMAN_BASELINE, 26));
        
        lblNombreP = new JLabel("Nombre: ",SwingConstants.CENTER);
        lblNombreP.setBounds(20, 100, 100,30);
        lblNombreP.setForeground(new Color(242, 227, 219));
        lblNombreP.setFont(new Font("arial", Font.ROMAN_BASELINE, 22));
        
        btninciar = new JButton("INICAR");
        btninciar.setBounds(90, 180, 150, 40);

        btninstruciones = new JButton("INSTRUCCIONES");
        btninstruciones.setBounds(270, 180, 150, 40);

        jpcontenedor.add(lblBienvenida);
        jpcontenedor.add(lblNombreP);
        jpcontenedor.add(btninciar);
        jpcontenedor.add(btninstruciones);

        txtNombre = new JTextField("");
        txtNombre.setBounds(130, 100, 350, 40);
        txtNombre.setForeground(Color.black);
        txtNombre.setFont(new Font("arial", Font.ROMAN_BASELINE, 20));
        
        jpcontenedor.add(txtNombre);

        //Listeners:
        btninciar.addActionListener(this);
        btninstruciones.addActionListener(this);

    }

    //Aqui usaremos los metdos contructores :D
    @Override
    public void actionPerformed(ActionEvent evento){
        if (evento.getSource() == btninciar) {
            JuegoStar();
        }else if (evento.getSource() == btninstruciones) {
            dispose();
            VentIntrucciones VentIntrucciones = new VentIntrucciones(); 
        }
    }

    private void JuegoStar() {
        String nombre= txtNombre.getText();
        if(!nombre.trim().isEmpty() || nombre.trim().length() > 0){
            dispose();
            VentanaSeleccion ventanaSeleccion = new VentanaSeleccion();
        }else {
            JOptionPane.showMessageDialog(null, "PORFAVOR INGRESO SU NOMBRE PARA INCIAR",
            "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestDefaultFocus();
        }
    }

}
