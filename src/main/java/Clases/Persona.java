package Clases;

public class Persona {

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    protected String nombre;
    private String sexo;
    private String direccion;
    
    public Persona(String nombre, String sexo, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.sexo=sexo;
    }
    
    public String mostrarDatos(){
        return "Nombre: "+nombre;
    }
    
}
