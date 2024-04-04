package gestor.empresarial.datos;

public abstract class DatosPersonales {
    //Atributos de la clase
    private int id;
    private String nombre;
    private String apellidos;
    private String correo;
    private String whatsapp;

    //getId() y setId() permiten obtener y establecer su valor de la variable.
    protected int getId() {
        return id;
    }
    protected void setId(int id) {
        this.id = id;
    }
    //getNombre() y setNombre() permiten obtener y establecer su valor de la variable.
    protected String getNombre() {
        return nombre;
    }
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getApellido() y setApellido() permiten obtener y establecer su valor de la variable.
    protected String getApellidos() {
        return apellidos;
    }
    protected void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //getCorreo() y setCorreo() permiten obtener y establecer su valor de la variable.
    protected String getCorreo() {
        return correo;
    }
    protected void setCorreo(String correo) {
        this.correo = correo;
    }
    //getWhatsapp() y setWhatsapp() permiten obtener y establecer su valor de la variable.
    protected String getWhatsapp() {
        return whatsapp;
    }
    protected void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
}
