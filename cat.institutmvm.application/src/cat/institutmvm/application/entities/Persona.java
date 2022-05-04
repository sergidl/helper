package cat.institutmvm.application.entities;

public class Persona {
    private String referencia;
    private String titol;

    
    /** 
     * @return String
     */
    public String getReferencia() {
        return referencia;
    }

    
    /** 
     * @param referencia
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    /** 
     * @return String
     */
    public String getTitol() {
        return titol;
    }

    
    /** 
     * @param titol
     */
    public void setTitol(String titol) {
        this.titol = titol;
    }
}