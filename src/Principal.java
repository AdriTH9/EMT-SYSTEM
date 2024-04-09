//Autor: Lizbeth Huitzil Leal
//Proyecto: Gestor Empresarial
//Fecha de inicio: 28/02/2024
//Ultima actualización: 01/02/2024

import gestor.empresarial.empleados.*;
import gestor.empresarial.contrato.*;
import gestor.empresarial.datos.*;
import gestor.empresarial.empresa.*;
import gestor.archivos.*;
import gestor.errores.*;
import gestor.interfaz.*;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

 class Principal {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Inicio de Sesion");//crea una venta nueva con un titulo
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();//obtienen las dimensiones ancho y aalto de un monitor
        int x= (pantalla.width/2)-300;//calcula el centro, del largo del monitor
        int y=(pantalla.height/2)-200;//calcula el centro, del alto del monitor

        //Loguin objloguin=new Loguin();

        //tiene que ver con la ventana:
        frame.setContentPane(new Loguin().panelloguin());//se instancia y se usa el getPanelMain. &  Tambien agrega nuestro PANEL del loguin al Frame
        //carga el panel
        //frame.setContentPane(objloguin.panelloguin());//se instancia y se usa el getPanelMain. &  Tambien agrega nuestro PANEL del loguin al Frame

        //con las sig.2 instrucciones activa el boton: cerrar,la X, cierra la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(600,400);//calcula el ancho y alto del panel
        frame.setLocation(x,y);//ubica la ventana en coordenadas

        frame.setVisible(true);//muestra el frame, se vuelve visible


        //Datos personales 1
        JFrame frameDP1= new JFrame("Datos Personales 1");//crea una venta nueva con un titulo
        Dimension pantallaDP1 = Toolkit.getDefaultToolkit().getScreenSize();//obtienen las dimensiones ancho y aalto de un monitor
        int a= (pantallaDP1.width/2)-300;//calcula el centro, del largo del monitor
        int b=(pantallaDP1.height/2)-200;//calcula el centro, del alto del monitor

        //Loguin objloguin=new Loguin();

        //tiene que ver con la ventana:
        frameDP1.setContentPane(new DatosPersonales().panelDP1());//se instancia y se usa el getPanelMain. &  Tambien agrega nuestro PANEL del loguin al Frame
        //carga el panel
        //frame.setContentPane(objloguin.panelloguin());//se instancia y se usa el getPanelMain. &  Tambien agrega nuestro PANEL del loguin al Frame

        //con las sig.2 instrucciones activa el boton: cerrar,la X, cierra la ventana
        frameDP1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameDP1.pack();

        frameDP1.setSize(600,400);//calcula el ancho y alto del panel
        frameDP1.setLocation(a,b);//ubica la ventana en coordenadas

        frameDP1.setVisible(true);//muestra el frame, se vuelve visible
    }
}