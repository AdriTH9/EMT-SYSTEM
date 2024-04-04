package gestor.archivos;

public abstract class ControlArchivos{//clase padre
    private String archivo;//atributo

    public ControlArchivos(String ctrl){//constructor

    }
    public boolean Crear(){

        return true;//retorna un valor, en este caso es true porque es boolean
    }
    public boolean Eliminar(){//retirna un valor booleano

        return false;
    }
    public boolean Cambiar(String cambiar){//retornaun valor booleano

        return true;
    }
    public boolean Mover(String mover){//retorna un valor booleano

        return false;
    }
}
