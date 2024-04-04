package gestor.archivos;

public interface iFileText{//declaramos la interfaz, es que se deben seguir reglas, si o si
    /*Lo sigueinte que se declara,ira cambiando, pára que funcione en todos lados
    por eso se quitan las llaves y se coloca ";"*/

    public void AbrirModoLectura();//no se programa nada hasta la implementacion
    public String Leer();
    public void AbrirModoEscritura();
    public void Escribir(String esc);//paso de parametros o firma
    public void Cerrar();
}
