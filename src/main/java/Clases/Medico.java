package Clases;


public class Medico extends Persona{
    private int codD;
    
    public Medico(String nombre, String sexo, String direccion, int codD) {
        super(nombre,sexo, direccion);
        this.codD=codD;
    }
    
    @Override
    public String mostrarDatos(){
        return "Doctor: "+nombre+" - Codigo: "+codD; 
    }
    
}
