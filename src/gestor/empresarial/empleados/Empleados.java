package gestor.empresarial.empleados;//Declara que esta clase pertenece al paquete gestor.empresarial
//Importa dos clases de otros paquetes
import gestor.empresarial.contrato.Cargos;
import gestor.errores.GestionErrores;
//Declara una clase abstracta Empleados que implementa la interfaz iEmpleados.
// Al ser abstracta, esta clase no puede ser instanciada pero si puede heredar
public abstract class Empleados implements iEmpleados {
    //Atibutos
    private int i;
    public GestionErrores error;
    //Constructor sin parámetros
    public Empleados(){

    }
    //Método addDatosPersonales con paso de parámetros
    public void addDatosPersonales (String z, String y, String x){

    }
    //Método addContrato con paso de parámetros
    public void addContrato(int a, int b, Cargos c){

    }
    //Método findEmpleado que regresa un entero
    private int findEmpleado (int s){
        return s;
    }
    //Método  findEmpleado que regresa 0
    private int findEmpleado (String e){
        return 0;
    }
    //Método setWhatsApp con parámetros
    public void setWhatsApp (int h, String t){

    }
    //Metódo datosPersonales con parámetro y regresa null
    private String datosPersonales (int u){
        return null;
    }
    //Metódo getInfoEmpleado con parámetro y regresa null
    public String getInfoEmpleado (int a){
        return null;
    }
    //Metódo getInfoEmpleado con parámetro y regresa null
    public String getInfoEmpleado (String a){
        return null;
    }
    //Metódo setAdscripcion con parámetro
    public void setAdscripcion (int a, String b){

    }
    //Metódo setTelefonoExtension con parámetros
    public void setTelefonoExtension (int c, String s){

    }
    //Metódo setPuesto con parámetros
    public void setPuesto (int g, String t){

    }
    //Mostrar datos del empleado
    public void showDatosEmpleados(){

    }
    //Mostrar contratos
    public void showContradosEmpleados (int x){

    }
    //Método getAntiguedad que regresa w
    public int getAntiguedad (int w){
        return w;
    }
    //Método setCargo con paso de parámetro
    public void setCargo(Cargos r){

    }
}
