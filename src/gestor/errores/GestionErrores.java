package gestor.errores;
//Se importa el paquete java.util.* para usar las clases y las interfaces que contiene, como Map.
import java.util.*;

public class GestionErrores {
    // para almacenar errores con un identificador único, un booleano existeError para indicar
    // si hay errores, un entero noErrror que parece ser un intento de almacenar el número de error actual
    private HashMap<Integer, String> error;
    private boolean existeError;
    private int noErrror;
    // guardar una descripción técnica del error.
    private String DescripccionTecnica;
    //Constructor GestionErrores
    public GestionErrores(){
        //Instancia
    error = new HashMap<Integer, String>();

    }
    //Métodos
    private void cargaErrores(){

    }
    public void setNoErrror (int noErrror, String a){

    }
    //Regresa null
    public String getError (){
        return null;
    }
    //Regresa null
    public String getErrorTecnico(){
        return null;
    }
    //Regresa existeError
    public boolean isExisteError() {
        return existeError;
    }
}
