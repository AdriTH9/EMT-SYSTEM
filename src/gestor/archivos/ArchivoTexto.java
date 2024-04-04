package gestor.archivos;

import java.io.*;

class ArchivoTexto implements iFileText{//el nombre de la implementacion debe ser igual al constructor
    //se declaran atributos:
    //abre el archivo
    private File file;//no es un atributo ordinario, es uno compuesto
    private FileReader fr;//lo abre y lo deja listo para lectura.
    /*Lo q contiene este, lo entrega al buffered*/

    private BufferedReader br;/*buffered, es un pedazo de memoria, y
     si necesita más pide más al procesador y va toamndo de apocos.
     es practicamente un arreglo y puede cargar grandes masas de info*/

    private FileWriter fw;//prepara el archivo para escritura
    private BufferedWriter bw;/*comunicacion, de todoo lo qu eesta en el reader, lo entrega/guarda al archivo*/
    private boolean archivoExistente;
    private boolean modoLectura;
    private boolean modoEscritura;


    public ArchivoTexto(String tituloArchivo){//constructor

    }
    public ArchivoTexto(String b, boolean c){//constructor

    }
    public void AbrirModoLectura(){

    }
    public String Leer(){
        return null;
    }
    public void AbrirModoEscritura(){

    }
    public void Escribir(String texto){

    }
    public void Cerrar(){
    }
}

