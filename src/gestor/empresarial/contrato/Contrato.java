package gestor.empresarial.contrato;

// Declaración de la clase Contrato
public final class Contrato {//final evita que sea heredada
    // Declaración de los atributos de la clase
    private int id;
    private int noContrato;
    private int annio;
    private String horario;
    private Cargos tipoCargo;
    // Constructor de la clase Contrato
    public Contrato(int id){ // parámetro 'id'
        // Inicialización del tipo de cargo
        tipoCargo = Cargos.confianza;
        tipoCargo = Cargos.sindicalizado;
        tipoCargo = Cargos.temporal;
    }
    // Métodos setter y getter
    public void setNoContrato(int noContrato) {
        this.noContrato = noContrato;
    }
    public int getNoContrato() {
        return noContrato;//regresa noContrato
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }
    public int getAnnio() {
        return annio;//regresa annio
    }
}
