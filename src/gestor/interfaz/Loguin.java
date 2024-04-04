package gestor.interfaz;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loguin extends JFrame implements ActionListener {
    private JButton btnguardar;
    private JButton btnReservar;
    private JButton btnCancelar;
    private JButton btnAbrir;
    private JPanel Contedor;


    public Loguin(){
        btnAbrir.addActionListener(this);//la supervisa la ventana principal
        btnguardar.addActionListener(this);//this es prascticamente LOGUIN
        btnCancelar.addActionListener(this);
        btnReservar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAbrir){//capta todos los eventos que pasam n el jpanel,detecta el click
            JOptionPane.showMessageDialog(null,"Hola mundo");//muestra un cuadro de dialogo chiquito
        }
        if (e.getSource() == btnCancelar){//capta todos los eventos que pasam n el jpanel,detecta el click
            System.out.println("Holav azul");
        }

    }
}
