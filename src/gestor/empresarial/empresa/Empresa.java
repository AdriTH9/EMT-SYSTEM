package gestor.empresarial.empresa;
//importar paquetes
import gestor.empresarial.empleados.Empleados;
import gestor.errores.GestionErrores;
//Declara la clase Empresa como final, lo que significa que no se puede heredar de ella.
public final class Empresa {
    //Atributos
    private String nombreEmpresa;
    private String representanteLegal;
    private String telefono;
    private String rfc;
    public Empleados datosRH;
    public GestionErrores error;
    //Constructor de Empresa con paso de parámetros
    public Empresa (String a, String b){

    }
    //Método setRepresentanteLegal
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    //Método getRepresentanteLegal, regresa representanteLegal
    public String getRepresentanteLegal() {
        return representanteLegal;
    }
    //Método setTelefono
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    //Método getInfo, regresa teléfono
    public String getInfo(){
        return telefono;
    }
}
