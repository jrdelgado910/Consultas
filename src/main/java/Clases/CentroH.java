package Clases;
public class CentroH {
    private String centroS;
    private String nombreC;
    private String direccionC;

    public CentroH() {
  
    }
    
   
    public void totCentros(String centroS, String nombreC, String direccionC){
        this.centroS=centroS;
        this.nombreC=nombreC;
        this.direccionC=direccionC;
           
    }

    public String getCentroS() {
        return centroS;
    }

    public void setCentroS(String centroS) {
        this.centroS = centroS;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getDireccionC() {
        return direccionC;
    }

    public void setDireccionC(String direccionC) {
        this.direccionC = direccionC;
    }

}
