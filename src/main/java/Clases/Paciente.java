package Clases;


public class Paciente extends Persona{

    public int getCodP() {
        return codP;
    }

    public String getMotivoC() {
        return motivoC;
    }

    public String getFechaC() {
        return fechaC;
    }
    private int codP;
    private String motivoC;
    private String fechaC;
    
    public Paciente(String nombre, String sexo, String direccion, int codP, String motivoC, String fechaC){
        super(nombre,sexo, direccion);
        this.codP=codP;
        this.motivoC=motivoC;
        this.fechaC=fechaC;
    }
    
    @Override
    public String mostrarDatos(){
        return "Paciente: "+nombre+" Fecha: "+fechaC+"  Motivo: "+motivoC; 
    }
    
    
}
