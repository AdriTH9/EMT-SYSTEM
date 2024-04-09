package gestor.interfaz;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosPersonales extends JFrame implements ActionListener {
    private JPanel panelDP1;
    private JTextField textId;
    private JTextField textFieldCorreoElec;
    private JButton btnAgregar;
    private JTextField textFielNomCompleto;
    private JButton btnCerrar;
    private JList list1;
    private JPanel Contenedor;

    public DatosPersonales(){
        btnAgregar.addActionListener(this);
        btnCerrar.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent i) {
        if (i.getSource() == btnAgregar){//capta todos los eventos que pasam n el jpanel,detecta el click
            String textoId;
            textoId= textId.getText();//saco el contenido del componente
            //lista.add("Hola",new Component);//add le pertenece a lista y es para agregar el texto
            textId.setText(textoId);
            JOptionPane.showMessageDialog(null,"Agregando ID... "+textId);//muestra un cuadro de dialogo chiquito

        }
        if (i.getSource() == btnCerrar){//capta todos los eventos que pasam n el jpanel,detecta el click
            System.out.println("Cerrando...");
        }

    }
    public JPanel panelDP1(){
        return this.Contenedor;
    }
}

