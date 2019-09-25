
package javaapplication57;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class ventana extends JFrame {
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ventana (){
        super("Formulario");
        setSize(500, 500);//establecemos el tamaño de la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel ("Nombre: ");
        JTextField texto = new JTextField (20);
        cp.add(etiqueta);
        cp.add(texto);
        JLabel etiqueta2 = new JLabel ("Apellido: ");
        JTextField texto2 = new JTextField (20);
        cp.add(etiqueta2);
        cp.add(texto2);
        //aqui va el calendario
        JLabel etiqueta3 = new JLabel ("Dirección: ");
        JTextField texto3 = new JTextField (20);
        cp.add(etiqueta3);
        cp.add(texto3);
        JLabel etiqueta4 = new JLabel ("telefono ");
        JTextField texto4 = new JTextField (20);
        cp.add(etiqueta4);
        cp.add(texto4);
       
        com.toedter.calendar.JDateChooser jDateChooser1;
        
        
        
    }
}
